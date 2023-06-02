package com.ust.customerapp.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ust.customerapp.exception.CustomerNotFoundException;
import com.ust.customerapp.model.Customer;

@Repository
public class CustomerRepoImpl implements CustomerRepo {

	List<Customer> customerList = new ArrayList<>();

	@Override
	public Customer addCustomer(Customer customer) {
		customerList.add(customer);
		return customer;
	}

	@Override
	public Customer getCustomer(int id) {
		Customer customer = customerList.stream()
							.filter(c -> c.getId() == id).findFirst()
							.orElseThrow(()->new CustomerNotFoundException("Customer with ID "+id+" Not Found"));
		
	//	.get() // returns the data
	//	.orElse(null);
		
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Customer oldCustomer = customerList.stream().filter(c -> c.getId() == customer.getId()).findFirst().get();
		oldCustomer.setCustomerName(customer.getCustomerName());
		oldCustomer.setDob(customer.getDob());
		oldCustomer.setEmail(customer.getEmail());
		return customer;

	}

	@Override
	public void deleteCustomer(int id) {
		Customer customer = getCustomer(id);
		customerList.remove(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerList;
	}

	@Override
	public Customer getCustomerByName(String customerName) {
		Customer customer = customerList.stream().filter(c -> c.getCustomerName().equalsIgnoreCase(customerName)).findFirst().get();
		return customer;
	}

}
