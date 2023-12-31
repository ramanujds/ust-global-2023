package com.mysmartshop.authserver.api;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
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
	PasswordEncoder passwordEncoder;
	
	@Autowired
	AuthenticationManager authMgr;
	
	@PostConstruct
	@Transactional
	public void initFewUsers() {
		
		User admin = new User();
		admin.setUsername("admin");
		String adminPass = passwordEncoder.encode("admin1234");
		admin.setPassword(adminPass);
		admin.setRole("ADMIN");
		
		User user = new User();
		user.setUsername("ramanuj");
		String userPass = passwordEncoder.encode("pass1234");
		user.setPassword(userPass);
		user.setRole("USER");
		
		repo.save(admin);
		repo.save(user);
	}
	
	

	
	
	
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
