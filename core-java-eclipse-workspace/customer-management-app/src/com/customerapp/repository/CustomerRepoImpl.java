package com.customerapp.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.customerapp.model.Customer;

public class CustomerRepoImpl implements CustomerRepo {

//	static List<Customer> customerDb = new ArrayList<>();
	
	Map<Integer, Customer> customerDb = new HashMap<>();
	
	@Override
	public Customer addCustomer(Customer c) {
		
		customerDb.put(c.getId(), c);
		return c;
		
	}

	@Override
	public Customer getCustomerById(int id) {
		
		return customerDb.get(id);
	}

	@Override
	public Customer getCustomerByName(String name) {
		
		for(Customer c:customerDb.values()) {
			if(c.getName().equalsIgnoreCase(name)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public void deleteCustomer(int id) {
		
		customerDb.remove(id);
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		return new ArrayList<>(customerDb.values());
	}

	
	
}
