package com.ust.customerapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ust.customerapp.model.Customer;
import com.ust.customerapp.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService service;
	
//	@ResponseStatus(code=HttpStatus.CREATED)
//	@PostMapping("/customers")
//	public Customer addCustomer(@RequestBody Customer customer) {
//		return service.addCustomer(customer);
//	}
	
	@GetMapping
	public String openSwaggerUI() {
		return "swagger-ui.html";
	}
	
	@ResponseStatus(code=HttpStatus.OK)
	@GetMapping("/view-customers")
	public String getAllCustomers(){
		 service.getAllCustomers();
		 return "show-customer.html";
	}
	
}
