package com.ust.springapp;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Laptop {
	@Autowired
	Scanner scan;
	
	public Laptop() {
		System.out.println("Laptop object created");
	}
	
	// Dependency Injection
	@Autowired
	private InternetConnection connection;

	public void browseInternet() {
		System.out.println("Enter url:");
		scan.nextLine();
		System.out.println("Trying to connect..");
		connection.browse();
	}

}
