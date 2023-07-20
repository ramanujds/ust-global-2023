package com.mysmartshop.authserver.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysmartshop.authserver.model.User;
import com.mysmartshop.authserver.repository.UserRepository;

@RestController
public class UseController {

	@Autowired
	private UserRepository repo;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return repo.findAll();
	}
	
	
}
