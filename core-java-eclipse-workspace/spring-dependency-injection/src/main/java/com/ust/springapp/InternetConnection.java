package com.ust.springapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("connection1")
public class InternetConnection {

	@Value("${connection-type}")
	private String connectionType;
	
	
	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public InternetConnection() {
		System.out.println("Internet Connection object created");
	}
	
	public void browse() {
		System.out.println("Connection type : "+connectionType);
		System.out.println("Browsing internet..");
	}
}
