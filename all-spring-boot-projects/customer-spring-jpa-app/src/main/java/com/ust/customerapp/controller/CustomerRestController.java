package com.ust.customerapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ust.customerapp.model.Customer;
import com.ust.customerapp.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {

	@Autowired
	private CustomerService service;
	
	@ResponseStatus(code=HttpStatus.CREATED)
	@PostMapping
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	
	@ResponseStatus(code=HttpStatus.OK)
	@GetMapping
	public List<Customer> getAllCustomers(){
		return service.getAllCustomers();
	}
	
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return service.getCustomer(id);
	}
	
	@GetMapping("/search")
	public Customer getCustomerByName(@RequestParam("name") String name){
		return service.getCustomerByName(name);
	}
	
	@PutMapping
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public Customer updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code=HttpStatus.OK)
	public void deleteCustomerById(@PathVariable int id) {
		service.deleteCustomer(id);
	}
	
	
}
