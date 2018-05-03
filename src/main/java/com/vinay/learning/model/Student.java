package com.vinay.learning.model;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private String country;
	
	private String favouriteLanguage;
	
	private String[] operatingSystems;
	
	
	private Map<String,String> countryOptions;
	
	private Map<String, String> favouriteLanguageOptions;
	
	public Student() {
//		countryOptions = new LinkedHashMap<>();
//		countryOptions.put("BR", "Brazil");
//		countryOptions.put("FR", "France");
//		countryOptions.put("DE", "Germany");
//		countryOptions.put("IN", "India");
		favouriteLanguageOptions = new LinkedHashMap<>();
		favouriteLanguageOptions.put("Java", "Java");
		favouriteLanguageOptions.put("PHP", "PHP");
		favouriteLanguageOptions.put("C#", "C#");
		favouriteLanguageOptions.put("Ruby", "Ruby");
		
		
	}
	
	
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


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}


	public void setCountryOptions(Map<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}


	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}


	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public Map<String, String> getFavouriteLanguageOptions() {
		return favouriteLanguageOptions;
	}

	public void setFavouriteLanguageOptions(Map<String, String> favouriteLanguageOptions) {
		this.favouriteLanguageOptions = favouriteLanguageOptions;
	}


	public String[] getOperatingSystems() {
		return operatingSystems;
	}


	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	

}
