package com.mysmartshop.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayServerApplication.class, args);
	}

}
