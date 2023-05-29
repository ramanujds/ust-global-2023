package com.ust.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	public Laptop() {
		System.out.println("Laptop object created");
	}
	
	@Autowired
	private InternetConnection connection;

	public void browseInternet() {
		System.out.println("Trying to connect..");
		connection.browse();
	}

}
