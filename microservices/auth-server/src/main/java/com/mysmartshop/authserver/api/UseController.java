package com.mysmartshop.authserver.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysmartshop.authserver.dto.JwtToken;
import com.mysmartshop.authserver.dto.UserCredentials;
import com.mysmartshop.authserver.model.User;
import com.mysmartshop.authserver.repository.UserRepository;
import com.mysmartshop.authserver.service.UserAuthService;

@RestController
@RequestMapping("/api/auth")
public class UseController {

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private UserAuthService authService;
	
	@Autowired
	AuthenticationManager authMgr;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return repo.findAll();
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		String password = user.getPassword();
		String encryptedPassword = passwordEncoder.encode(password);
		user.setPassword(encryptedPassword);
		repo.save(user);
		return user;
	}
	
	@PostMapping("/login")
	public JwtToken authenticate(@RequestBody UserCredentials user) {
		authMgr.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		String jwt = authService.validateUserCredentials(user);
		
		return new JwtToken(jwt);
	}
	
	
}
