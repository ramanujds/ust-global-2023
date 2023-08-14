package com.mysmartshop.authserver.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mysmartshop.authserver.model.User;
import com.mysmartshop.authserver.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	UserRepository repo;
	
	
	
	 public UserDetails loadUserByUsername(String username) {
		User user =  repo.findByUsername(username);
		return new UserDetailsModel(user);
	}
	 
	 
	
}
