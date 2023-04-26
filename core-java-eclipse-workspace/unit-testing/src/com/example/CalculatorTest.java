package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

// import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator calc;
	
	@BeforeEach
	public void init() {
		System.out.println("Init Test");
		calc = new Calculator();
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("Test Complete");
		calc = null;
	}
	
	@Test
	public void testAdd() {
		// Given
		
		int x=10, y = 20;
		
		//When
		int result = calc.add(x, y);
		
		//Then
		Assertions.assertEquals(30, result);
	}
	
	@Test
	public void testFindLargest() {
		
		
		
		assertEquals(100, calc.findLargest(100, 30));
		assertEquals(40, calc.findLargest(10, 40));
		assertEquals(-10, calc.findLargest(-30, -10));
		
		
	}
	
	
	@Test
	public void testDivide() {
		
		
		assertEquals(5, calc.divide(10, 2));
		
		assertEquals(3, calc.divide(10, 3));
		
		assertThrows(ArithmeticException.class, ()-> calc.divide(10, 0));
	}
	
}
