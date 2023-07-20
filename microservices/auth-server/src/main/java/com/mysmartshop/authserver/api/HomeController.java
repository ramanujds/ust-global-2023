package com.mysmartshop.authserver.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/message")
	public String greet() {
		return "Hello from Us";
	}
	
	@GetMapping("/user")
	public String greetUser() {
		return "Hello User";
	}
	
	@GetMapping("/admin")
	public String greetAdmin() {
		return "Hello Admin";
	}

}
