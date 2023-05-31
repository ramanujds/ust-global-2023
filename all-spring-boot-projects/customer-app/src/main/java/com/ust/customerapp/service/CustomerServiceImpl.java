package com.ust.customerapp.service;

import java.util.List;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.customerapp.model.Customer;
import com.ust.customerapp.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo repo;

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

}
