package lists;

import java.util.Set;

public class CustomerApp {

	public static void main(String[] args) {
		
		CustomerRepository repo = new CustomerRepository();
		
		// Create customer object
		Customer c1 = new Customer(101, "Karan", "karan@yahoo.com");
		Customer c2 = new Customer(102, "Biraj", "biraj@yahoo.com");
		Customer c3 = new Customer(103, "Harsh", "harsh@yahoo.com");
		Customer c4 = new Customer(104, "Rohit", "rohit@yahoo.com");
		Customer c5 = new Customer(104, "Rohit", "rohit@yahoo.com");
		// Adding a new customer
		try {
		repo.addCustomer(c1);
		repo.addCustomer(c2);
		repo.addCustomer(c3);
		repo.addCustomer(c4);
		repo.addCustomer(c5);
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		// Getting all the customer
		
		try {
			Customer cu = repo.getCustomerByName("anil");
		} catch (CustomerNotFoundException e) {
			
			System.err.println(e.getMessage());
		}
		
		Set<Customer> customers = repo.getAllCustomer();
		
		// Display all the customers
		
		for(Customer c:customers) {
			System.out.println(c);
		}
		
	}
	
}
