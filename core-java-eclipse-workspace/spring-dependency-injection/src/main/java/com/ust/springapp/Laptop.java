package com.ust.springapp;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("laptop1")
public class Laptop {

	@Autowired  // Field Injection
	Scanner scan;
	@Value("${laptop.brand}")
	private String brand;
	@Value("${laptop.model}")
	private String model;
	@Value("${laptop.ram}")
	private int ram;
	
	public Laptop() {
		System.out.println("Laptop object created");
	}
	
	// Dependency Injection

	private InternetConnection connection;
	
	

	@Autowired // Constructor Injection
	public Laptop(InternetConnection connection) {
	
		System.out.println("Injected by the constructor");
		this.connection = connection;
	}


	

	public Scanner getScan() {
		return scan;
	}




	@Autowired
	public void setScan(Scanner scan) {
		System.out.println("Injected by the setter");
		this.scan = scan;
	}




	public InternetConnection getConnection() {
		return connection;
	}




	public void setConnection(InternetConnection connection) {
		this.connection = connection;
	}




	public void browseInternet() {
//		System.out.println("Enter url:");
//		scan.nextLine();
		System.out.println("Trying to connect..");
		connection.browse();
		System.out.println("Laptop Details : ");
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("RAM : "+ram);
		
	}

}
