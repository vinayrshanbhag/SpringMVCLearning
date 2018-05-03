package com.vinay.learning.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vinay.learning.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}

	@RequestMapping("/showForm")
	public String showCustomerForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processCustomerForm(@Valid @ModelAttribute("customer") Customer customer, 
			                          BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			System.out.println(bindingResult);
			return "customer-form";
		}
		else {
			return "customer-confirmation";
		}
		
		
		
	}

}
