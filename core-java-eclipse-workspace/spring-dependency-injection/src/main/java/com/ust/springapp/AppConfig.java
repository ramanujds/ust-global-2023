package com.ust.springapp;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"com.ust.springapp"})
public class AppConfig {
	
	@Bean
	public Scanner getScannerBean() {
		return new Scanner(System.in);
	}
	
//	public Laptop getLaptopBean() {
//		return new Laptop();
//	}
	
}
