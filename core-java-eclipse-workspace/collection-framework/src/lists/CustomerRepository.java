package lists;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

	List<Customer> customers = new ArrayList<>();

	// create a method to add a new customer

	public void addCustomer(Customer c) {
		customers.add(c);
	}

	// create a method to get all the customer

	public List<Customer> getAllCustomer() {
		return customers;
	}

	public Customer getCustomerByName(String name) {

		for (Customer c : customers) {
			if (c.getName().equalsIgnoreCase(name)) {
				return c;
			}
		}

		return null;
	}

	public Customer getCustomerById(int id) {

		for (Customer c : customers) {
			if (c.getId() == id) {
				return c;
			}
		}

		return null;
	}

	public void deleteCustomer(int id) {
		Customer c = getCustomerById(id);
		customers.remove(c);
	}

}
