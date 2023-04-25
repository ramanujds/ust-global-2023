package com.customerapp.service;

import java.util.List;

import com.customerapp.model.Customer;
import com.customerapp.repository.CustomerRepo;
import com.customerapp.repository.CustomerRepoImpl;

public class CustomerServiceImpl implements CustomerService{

	CustomerRepo repo = new CustomerRepoImpl();
	
	@Override
	public Customer addCustomer(Customer c) {
		// logic to validate customer data
		return repo.addCustomer(c);
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		return repo.getAllCustomers();
	}

}
