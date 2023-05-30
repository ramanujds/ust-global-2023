package com.ust.springapp;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.ust.springapp"})
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public Scanner getScannerBean() {
		return new Scanner(System.in);
	}
	
	
//	@Bean("laptop2")
//	public Laptop getLaptopBean() {
//		return new Laptop();
//	}
//	
//	@Bean("broadband")
//	public InternetConnection getInternetConnectionBean() {
//		InternetConnection c = new InternetConnection();
//		c.setConnectionType("Broadband");
//		return c;
//	}
	
	
	
}
