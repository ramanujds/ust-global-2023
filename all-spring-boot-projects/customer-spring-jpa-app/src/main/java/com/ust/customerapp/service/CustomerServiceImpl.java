package com.ust.customerapp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.codec.Decoder;
import org.springframework.core.codec.Encoder;
import org.springframework.http.codec.CodecConfigurer.CustomCodecs;
import org.springframework.http.codec.CodecConfigurer.DefaultCodecConfig;
import org.springframework.http.codec.HttpMessageReader;
import org.springframework.http.codec.HttpMessageWriter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ust.customerapp.exception.CustomerNotFoundException;
import com.ust.customerapp.model.Customer;
import com.ust.customerapp.repository.CustomerRepository;



@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository repo;
	
	
	
	public CustomerRepository getRepo() {
		return repo;
	}


	public void setRepo(CustomerRepository repo) {
		this.repo = repo;
	}


	public Customer addCustomer(Customer customer) {
		return repo.save(customer);	
	}


	public Customer getCustomer(int id) {
		
//		if(!repo.existsById(id)) {
//			throw new CustomerNotFoundException("Customer with ID : "+id+" Not found");
//		}
		
		Customer customer = repo.findById(id)
							.orElseThrow(()->new CustomerNotFoundException("Customer with ID : "+id+" Not found")); 
		
//		Customer customer = repo.findById(id).get();
		
		return customer;
	}


	
	public Customer updateCustomer(Customer customer) {
		int id = customer.getId();
		if(!repo.existsById(id)) {
			throw new CustomerNotFoundException("Customer with ID : "+id+" Not found");
		}
		return repo.save(customer);	
	}


	public void deleteCustomer(int id) {
		if(!repo.existsById(id)) {
			throw new CustomerNotFoundException("Customer with ID : "+id+" Not found");
		}
		repo.deleteById(id);
	}


	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

	
	public Customer getCustomerByName(String customerName) {
		return repo.findByCustomerName(customerName).orElseThrow(()->new CustomerNotFoundException("Customer with Name : "+customerName+" Not found"));
	}
	
	@Override
	public List<Customer> findCustomerInDobRange(LocalDate from, LocalDate to) {
		return repo.findByDobRange(from, to);
	}

}
