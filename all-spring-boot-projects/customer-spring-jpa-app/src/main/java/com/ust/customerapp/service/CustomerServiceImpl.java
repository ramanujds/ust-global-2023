package com.ust.customerapp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.codec.Decoder;
import org.springframework.core.codec.Encoder;
import org.springframework.http.codec.CodecConfigurer.CustomCodecs;
import org.springframework.http.codec.CodecConfigurer.DefaultCodecConfig;
import org.springframework.http.codec.HttpMessageReader;
import org.springframework.http.codec.HttpMessageWriter;
import org.springframework.stereotype.Service;

import com.ust.customerapp.model.Customer;
import com.ust.customerapp.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository repo;
	
	
	public Customer addCustomer(Customer customer) {
		return repo.save(customer);	
	}


	public Customer getCustomer(int id) {
		Customer customer = repo.findById(id).get();
		return customer;
	}


	public Customer updateCustomer(Customer customer) {
		return repo.save(customer);	
	}


	public void deleteCustomer(int id) {
		repo.deleteById(id);
	}


	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

	
	public Customer getCustomerByName(String customerName) {
		return repo.findByCustomerName(customerName).get();
	}
	
	@Override
	public List<Customer> findCustomerInDobRange(LocalDate from, LocalDate to) {
		return repo.findByDobRange(from, to);
	}

}
