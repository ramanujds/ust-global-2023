package com.ust.customerapp.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ust.customerapp.model.Customer;
import com.ust.customerapp.repository.CustomerRepository;
import com.ust.customerapp.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin
public class CustomerRestController {
	
	@Value("base-url")
	private String baseUrl;

	@Autowired
	private CustomerRepository repo;
	
	@ResponseStatus(code=HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	public Customer addCustomer(@RequestBody @Valid Customer customer) {
		return repo.save(customer);
	}
	
	@ResponseStatus(code=HttpStatus.OK)
	@GetMapping
	public List<Customer> getAllCustomers(){
		return service.getAllCustomers();
	}
	
	// @GetMapping("/{id}")
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int customerId) {
		Customer customer = repo.findById(customerId).get();
		return ResponseEntity.ok(customer);
	}
	
	@GetMapping(value =  "/search")
	public Customer getCustomerByName(@RequestParam("name") String name){
		return service.getCustomerByName(name);
	}
	
	@PutMapping(produces = "application/json", consumes = "application/json")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public Customer updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code=HttpStatus.OK)
	public void deleteCustomerById(@PathVariable int id) {
		service.deleteCustomer(id);
	}
	
	@GetMapping("/dob/from/{from}/to/{to}")
	public List<Customer> searchCustomerByDobRange(@PathVariable
			@DateTimeFormat(pattern ="yyyy-MM-dd" ) LocalDate from,
			@PathVariable  @DateTimeFormat(pattern ="yyyy-MM-dd" )
			LocalDate to){
		
		return service.findCustomerInDobRange(from ,to);
	}
	
	
}
