package com.ust.customerapp.repository;

import java.util.List;

import com.ust.customerapp.model.Customer;

public interface CustomerRepo {

	public Customer addCustomer(Customer customer);
	
	public Customer getCustomer(int id);
	
	public Customer updateCustomer(Customer customer);
	
	public void deleteCustomer(int id);
	
	public List<Customer> getAllCustomers();

	public Customer getCustomerByName(String customerName);
	
}
