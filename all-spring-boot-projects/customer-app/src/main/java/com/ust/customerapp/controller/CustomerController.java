package com.ust.customerapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ust.customerapp.model.Customer;
import com.ust.customerapp.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@ResponseStatus(code=HttpStatus.CREATED)
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	
	@ResponseStatus(code=HttpStatus.OK)
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		return service.getAllCustomers();
	}
	
}
