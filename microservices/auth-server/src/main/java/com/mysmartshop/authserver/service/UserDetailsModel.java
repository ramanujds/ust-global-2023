package com.mysmartshop.authserver.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.mysmartshop.authserver.model.User;

public class UserDetailsModel implements UserDetails{
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	private String username;
	private String password;
	private List<GrantedAuthority> auths;
	
	
	public UserDetailsModel(User user) {
		this.username=user.getUsername();
		this.password=user.getPassword();
				
				//passwordEncoder.encode(user.getPassword());
		
		this.auths=Arrays.stream(user.getRole().split(","))
					 		.map(role->"ROLE_"+role)
					 		.map(role->new SimpleGrantedAuthority(role))
					 	//  .map(SimpleGrantedAuthority::new)
					 		.collect(Collectors.toList());
		
	}
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return auths;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
