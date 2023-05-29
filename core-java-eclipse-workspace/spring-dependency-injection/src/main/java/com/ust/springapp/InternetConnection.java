package com.ust.springapp;

import org.springframework.stereotype.Component;

@Component
public class InternetConnection {

	public InternetConnection() {
		System.out.println("Internet Connection object created");
	}
	
	public void browse() {
		System.out.println("Browsing internet..");
	}
}
