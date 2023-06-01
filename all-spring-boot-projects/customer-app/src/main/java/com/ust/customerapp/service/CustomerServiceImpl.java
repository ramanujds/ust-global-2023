package com.ust.customerapp.service;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.customerapp.model.Customer;
import com.ust.customerapp.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo repo;
	
	@PostConstruct
	public void initSomeCustomer() {
		Customer c1 = new Customer(1001, "Karan", "karan@yahoo.com", LocalDate.of(1994, 10, 10));
		Customer c2 = new Customer(1005, "Rohan", "rohan@yahoo.com", LocalDate.of(1998, 5, 10));
		Customer c3 = new Customer(1006, "Mohit", "mohit@yahoo.com", LocalDate.of(1995, 4, 15));
		repo.addCustomer(c1);
		repo.addCustomer(c2);
		repo.addCustomer(c3);
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return repo.addCustomer(customer);
	}

	@Override
	public Customer getCustomer(int id) {
		return repo.getCustomer(id);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return repo.updateCustomer(customer);
	}

	@Override
	public void deleteCustomer(int id) {
		repo.deleteCustomer(id);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return repo.getAllCustomers();
	}
	
	@Override
	public Customer getCustomerByName(String customerName) {
		return repo.getCustomerByName(customerName);
	}

}
