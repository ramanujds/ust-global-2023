package com.ust.app.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@GetMapping
	public String sayHello() {
		return "Hello World.. Welcome to Spring Boot";
	}
	
}
