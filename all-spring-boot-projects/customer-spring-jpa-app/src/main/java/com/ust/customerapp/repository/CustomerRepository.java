package com.ust.customerapp.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ust.customerapp.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	// JPQL 
	
	@Query(value = "from Customer where customerName=:customerName")
	public Optional<Customer> findByCustomerName(@Param("customerName") String customerName);
	
	@Query(value = "from Customer where dob between :from and :to")
	public List<Customer> findByDobRange(LocalDate from, LocalDate to);
	
	// Native SQL
	
	@Query(value = "select * from customer_data where id between :start and :end", 
			nativeQuery = true)
	public List<Customer> findIdInRange(int start, int end);
	
}
