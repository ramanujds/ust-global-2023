//package com.ust.customerapp.service;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.time.LocalDate;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.ust.customerapp.exception.CustomerNotFoundException;
//import com.ust.customerapp.model.Customer;
//import com.ust.customerapp.model.UserType;
//
//@SpringBootTest
//class CustomerServiceImplIntegrationTest {
//
//	@Autowired
//	private CustomerService service;
//	
//	
//	@Test
//	void testAddCustomer() {
//		// Given
//		Customer c1 = new Customer(105, "Steve", "steve@yahoo.com", 
//					LocalDate.of(2000, 10, 10), UserType.GENERAL);
//		
//		// When
//		Customer savedCustomer = service.addCustomer(c1);
//		
//		// Then
//		
//		assertEquals(c1, savedCustomer);
//		
//	}
//
//	@Test
//	void testGetCustomer() {
//		
//		// Given
//		int id = 101;
//		int id2 = 100;
//		
//		// When
//		Customer c1 = service.getCustomer(id);
//		
//		// Then
//		assertNotNull(c1);
//		assertThrows(CustomerNotFoundException.class, ()->service.getCustomer(id2));
//		
//	}
////
////	@Test
////	void testUpdateCustomer() {
////		fail("Not yet implemented");
////	}
////
////	@Test
////	void testDeleteCustomer() {
////		fail("Not yet implemented");
////	}
////
////	@Test
////	void testGetAllCustomers() {
////		fail("Not yet implemented");
////	}
////
////	@Test
////	void testGetCustomerByName() {
////		fail("Not yet implemented");
////	}
////
////	@Test
////	void testFindCustomerInDobRange() {
////		fail("Not yet implemented");
////	}
//
//}
