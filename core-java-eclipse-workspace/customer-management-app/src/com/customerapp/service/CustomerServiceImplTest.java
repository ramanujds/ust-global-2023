package com.customerapp.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.customerapp.model.Customer;

class CustomerServiceImplTest {

	CustomerServiceImpl service;

	@BeforeEach
	public void setUp() {
		service = new CustomerServiceImpl();
		Customer c1 = new Customer(101, "Manish", "manish@yahoo.com");
		Customer c2 = new Customer(102, "Rohit", "rohit@yahoo.com");
		Customer c3 = new Customer(103, "Harsha", "harsha@yahoo.com");
		service.addCustomer(c1);
		service.addCustomer(c2);
		service.addCustomer(c3);
	}

	@AfterEach
	public void tearDown() {
		service = null;
	}

	@Test
	void testAddCustomer() {
		// Given
		Customer c = new Customer(105, "Suraj", "suraj@yahoo.com");
		// When
		service.addCustomer(c);
		// Then
		assertNotNull(service.getCustomerById(105));

		// Given
		Customer c2 = new Customer(105, "Suraj", "suraj@yahoo.com");
		// When
		service.addCustomer(c2);
		// Then
		assertNotNull(service.getCustomerById(105));

	}

	@Test
	void testGetCustomerById() {

		int id = 101;

		assertNotNull(service.getCustomerById(id));

		id = 108;

		assertNull(service.getCustomerById(id));

	}

	@Test
	@Disabled
	void testGetCustomerByName() {
		fail("Not yet implemented");
	}

//
	@Test
	void testDeleteCustomer() {
		// Given
		int id = 101;
		int id2 = 201;
		// When
		service.deleteCustomer(id);
		service.deleteCustomer(id2);
		// Then
		assertNull(service.getCustomerById(id));

	}

//
	@Test
	void testGetAllCustomers() {

		List<Customer> customers = service.getAllCustomers();
		assertTrue(customers.size() == 3);

	}

}
