package com.mysmartshop.authserver.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.mysmartshop.authserver.repository.UserRepository;
import com.mysmartshop.authserver.util.AuthenticationFilter;

@Configuration
public class AuthConfiguration extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserRepository repo;
	
	@Autowired 
	UserDetailsService userDetailsService;
	
	@Autowired
	private AuthenticationFilter filter;
	
	
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
			.antMatchers("/api/auth/admin/**")
			.hasRole("ADMIN")
			.antMatchers("/api/auth/user/**")
			.hasAnyRole("USER","ADMIN")
			.antMatchers("/**")
			.permitAll()
			.anyRequest()
			.authenticated()
			.and()
			.exceptionHandling()
			.and()
			.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
			
			http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
		
//			.and()
//			.formLogin() // to add a default login form
//			.and()
//			.httpBasic();
			
	}
	
	
	
//	@Bean
//	PasswordEncoder passwordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
	
	@Bean
	PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationManager getAuthenticationManager() throws Exception {
		return super.authenticationManager();
	}
	
	


}
