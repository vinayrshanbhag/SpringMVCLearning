package com.vinay.learning.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("studentName");
		model.addAttribute("message", name.toUpperCase());
		
		
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormWithRequestParam")
	public String processRequestParam(Model model,@RequestParam("studentName") String studentName) {
		
		model.addAttribute("message", studentName.toUpperCase());
		
		
		return "helloworld";
	}

}
