package com.customerapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.customerapp.model.Customer;
import com.customerapp.repository.CustomerRepo;
import com.customerapp.repository.CustomerRepoImpl;
import com.customerapp.repository.CustomerRepoJdbcImpl;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepo repo;
	
	@Override
	public Customer addCustomer(Customer c) {
		// logic to validate customer data
		return repo.addCustomer(c);
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return repo.getCustomerById(id);
	}

	@Override
	public Customer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		return null;
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
