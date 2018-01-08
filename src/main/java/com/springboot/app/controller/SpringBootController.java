package com.springboot.app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpringBootController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot Demo";
	}
	
	@RequestMapping("/hello")
	public String myData() {
		return "Hello Spring Boot";
	}
}