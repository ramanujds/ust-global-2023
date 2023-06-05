package com.ust.customerapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.customerapp.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	public Optional<Customer> findByCustomerName(String customerName);
	
}
