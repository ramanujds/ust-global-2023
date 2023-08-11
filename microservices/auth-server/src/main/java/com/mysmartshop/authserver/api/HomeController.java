package com.mysmartshop.authserver.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysmartshop.authserver.dto.Message;

@RestController
@RequestMapping("/api/auth")
public class HomeController {
	
	@GetMapping("/message")
	public Message greet() {
		return new Message("Hello from Us");
	}
	
	@GetMapping("/user")
	public Message greetUser() {
		return new Message("Hello User");
	}
	
	@GetMapping("/admin")
	public Message greetAdmin() {
		return new Message("Hello Admin");
	}

}
