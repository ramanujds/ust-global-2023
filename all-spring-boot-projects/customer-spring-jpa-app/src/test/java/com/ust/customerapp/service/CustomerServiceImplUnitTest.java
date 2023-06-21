//package com.ust.customerapp.service;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.time.LocalDate;
//import java.util.Optional;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.ust.customerapp.exception.CustomerNotFoundException;
//import com.ust.customerapp.exception.DuplicateCustomerException;
//import com.ust.customerapp.model.Customer;
//import com.ust.customerapp.model.UserType;
//import com.ust.customerapp.repository.CustomerRepository;
//
//@ExtendWith(MockitoExtension.class)
//class CustomerServiceImplUnitTest {
//
//	@Mock
//	private CustomerRepository repo;
//
//	@InjectMocks
//	private CustomerServiceImpl service;
//
//	@Test
//	void testAddCustomer() {
//		// Given
//		Customer c1 = new Customer(105, "Steve", "steve@yahoo.com", LocalDate.of(2000, 10, 10), UserType.GENERAL);
//		Customer c2 = new Customer(106, "John", "john@yahoo.com", LocalDate.of(2000, 10, 10), UserType.GENERAL);
//
//		// When
//		when(repo.save(c1)).thenReturn(c1);
//		when(repo.save(c2)).thenThrow(new DuplicateCustomerException("Duplicate Customer"));
//
//		// Then
//		assertEquals(c1, service.addCustomer(c1));
//		assertThrows(DuplicateCustomerException.class, () -> service.addCustomer(c2));
//
//		// Verify whether repo.save() method is called 1 time
//		verify(repo, times(1)).save(c1);
//		verify(repo, times(1)).save(c2);
//
//	}
//
//	@Test
//	void testGetCustomer() {
//
//		// Given
//		int id1 = 101;
//		int id2 = 100;
//		Customer c1 = new Customer(101, "Steve", "steve@yahoo.com", LocalDate.of(2000, 10, 10), UserType.GENERAL);
//
//		// When
//		when(repo.findById(id1)).thenReturn(Optional.of(c1));
//		when(repo.findById(id2)).thenThrow(CustomerNotFoundException.class);
//
//		// Then
//		assertEquals(c1, service.getCustomer(id1));
//		assertThrows(CustomerNotFoundException.class, () -> service.getCustomer(id2));
//
//		// Verify whether repo.save() method is called 1 time
//		verify(repo, times(1)).findById(id1);
//		verify(repo, times(1)).findById(id2);
//
//	}
//
////
////	@Test
////	void testUpdateCustomer() {
////		fail("Not yet implemented");
////	}
////
//	@Test
//	void testDeleteCustomer() {
//		// Given
//		int id1 = 101;
//		int id2 = 100;
//
//		// When
//		when(repo.existsById(id1)).thenReturn(true);
//		when(repo.existsById(id2)).thenReturn(false);
//
//		// Then
//		assertDoesNotThrow(() -> service.deleteCustomer(id1));
//		assertThrows(CustomerNotFoundException.class, () -> service.deleteCustomer(id2));
//
//		// Verify
//		verify(repo, times(1)).deleteById(id1);
//		verify(repo, times(1)).existsById(id2);
//	}
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
