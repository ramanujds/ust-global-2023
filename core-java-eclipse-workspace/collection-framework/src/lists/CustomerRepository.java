package lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CustomerRepository {

	Set<Customer> customers = new HashSet<>();

	// create a method to add a new customer

	public void addCustomer(Customer c) throws DuplicateCustomerException {
		for(Customer cust:customers) {
			if(cust.getId()==c.getId()) {
				throw new DuplicateCustomerException("Customer with id:"+c.getId()+" already present");
			}
		}
		customers.add(c);
	}

	// create a method to get all the customer

	public Set<Customer> getAllCustomer() {
		return customers;
	}

	public Customer getCustomerByName(String name) throws CustomerNotFoundException {

		for (Customer c : customers) {
			if (c.getName().equalsIgnoreCase(name)) {
				return c;
			}
		}

		throw new CustomerNotFoundException("Customer with Name: "+name+" Not Found");
		
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
