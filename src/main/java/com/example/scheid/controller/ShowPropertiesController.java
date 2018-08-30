package com.example.scheid.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowPropertiesController {

	@Value("${property.teste.wander}") String propertyTesteWander;
	
	@GetMapping("/showProperty")
	public String showPropertyTest() {
		return propertyTesteWander;
		
	}
	
}
