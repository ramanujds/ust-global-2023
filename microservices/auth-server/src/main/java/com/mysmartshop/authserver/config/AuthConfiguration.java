package com.mysmartshop.authserver.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.mysmartshop.authserver.model.User;
import com.mysmartshop.authserver.repository.UserRepository;
import com.mysmartshop.authserver.service.UserDetailsModel;

@Configuration
public class AuthConfiguration extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserRepository repo;
	
	@Autowired 
	UserDetailsService userDetailsService;
	
	// Authentication 
	// Creating in-memory users with roles
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication()
//				.withUser("vivek")
//				.password(getPasswordEncoder().encode("pass1234"))
//				.roles("USER")
//				.and()
//				.withUser("rahul")
//				.password(getPasswordEncoder().encode("rahul1234"))
//				.roles("ADMIN")
//				;
//	}
	
	// Authentication 
	// Creating users from database
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.userDetailsService(userDetailsService);
		
	}
	
	// Authorization
	// Role based API Level
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().
			authorizeHttpRequests()
			.antMatchers("/admin/**")
			.hasRole("ADMIN")
			.antMatchers("/user/**")
			.hasAnyRole("USER","ADMIN")
//			.antMatchers("/**")
//			.permitAll()
			.antMatchers(HttpMethod.POST,"/**")
			.permitAll()
//			.and()
//			.formLogin() // to add a default login form
			.and()
			.httpBasic();
			
	}
	
	
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
//	@Bean
//	PasswordEncoder getPasswordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
	
	


}
