package com.vinay.learning.controller;

import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vinay.learning.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}")
	private Map<String,String> countryOptions;
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Student theStudent = new Student();
		model.addAttribute("student", theStudent);
		model.addAttribute("countryOptions", countryOptions);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processStudentForm(@ModelAttribute("student") Student student) {
		
		Logger.getLogger(getClass().getName()).info("student :"+ student.getFirstName() + ":"+ student.getLastName() );
		
		
		return "student-confirmation";
	}

}
