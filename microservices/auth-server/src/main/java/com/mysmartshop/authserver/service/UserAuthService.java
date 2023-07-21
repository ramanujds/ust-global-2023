package com.mysmartshop.authserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mysmartshop.authserver.dto.UserCredentials;
import com.mysmartshop.authserver.exception.InvalidCredentialsException;
import com.mysmartshop.authserver.model.User;
import com.mysmartshop.authserver.repository.UserRepository;
import com.mysmartshop.authserver.util.JwtUtil;

@Service
public class UserAuthService {

	@Autowired
	private UserRepository repo;

	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	PasswordEncoder passwordEncoder;

	public String validateUserCredentials(UserCredentials user) {
		String username = user.getUsername();
		String password = user.getPassword();

		User usr = repo.findByUsername(username);

		if (usr == null)
			throw new InvalidCredentialsException("Invalid username or password");

		String pass = usr.getPassword();
		if (!passwordEncoder.matches(password,usr.getPassword())) {

			throw new InvalidCredentialsException("Invalid username or password");

		}

		String jwt = jwtUtil.generateToken(username);
		return jwt;

	}

}
