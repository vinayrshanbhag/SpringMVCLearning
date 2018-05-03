package com.vinay.learning.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.vinay.learning.validation.CourseCode;

public class Customer{
	
	
	private String firstName;
	
	
	@Size(min=1 ,message="is required")
	@NotNull(message="is required")
	private String lastName;
	
	@Min(value=0,message= "minimum of 0 can be entered")
	@Max(value=10,message= "maximum of 10 can be entered")
	private Integer freePasses;
	
	
	@Pattern(regexp="^[a-zA-Z0-9]{6}", message = "only 6 chars/Digts")
	private String postalCode;
	
	@CourseCode(value="LOV",message="Course code should start with LOV")
	private String courseCode;
	
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
}