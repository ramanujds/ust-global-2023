package com.customerapp.repository;

import java.util.ArrayList;
import java.util.List;

import com.customerapp.model.Customer;

public class CustomerRepoImpl implements CustomerRepo {

	static List<Customer> customerDb = new ArrayList<>();
	
	@Override
	public Customer addCustomer(Customer c) {
		
		customerDb.add(c);
		return c;
		
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
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
