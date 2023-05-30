package com.ust.springapp;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = 
					new AnnotationConfigApplicationContext(AppConfig.class);
		
		Laptop laptop = context.getBean("laptop1",Laptop.class);
		
		laptop.browseInternet();
	}
	
}
