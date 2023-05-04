package com.customerapp.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerServiceImplTest {
	
	CustomerService service = new CustomerServiceImpl();

	@Test
	void testAddCustomer() {
		assertEquals(service.getCustomerById(1001), null);
	}

	

}
