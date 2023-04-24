package collectionsorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import lists.Customer;

public class SortingCollection {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(10, 45, 30, 25, 6);

		// will be printed in the order inserted
		System.out.println(nums);

		// Sorting the list
		Collections.sort(nums);

		System.out.println(nums);

		List<String> names = Arrays.asList("karan", "suraj", "rohit", "amit", "manish");
		// will be printed in the order inserted
		System.out.println(names);

		Collections.sort(names);

		System.out.println(names);

		// Sorting a list of customer

		List<Customer> customers = new ArrayList<>();

		// Create customer object
		Customer c1 = new Customer(101, "Karan", "karan@yahoo.com");
		Customer c2 = new Customer(102, "Biraj", "biraj@yahoo.com");
		Customer c3 = new Customer(103, "Harsh", "harsh@yahoo.com");
		Customer c4 = new Customer(104, "Rohit", "rohit@yahoo.com");

		// Adding a new customer
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		
		Collections.sort(customers);
		
		for(Customer c:customers) {
			System.out.println(c);
		}

	}

}
