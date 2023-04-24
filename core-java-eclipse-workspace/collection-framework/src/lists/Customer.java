package lists;

import java.util.Objects;

public class Customer implements Comparable<Customer> {

	private int id;
	private String name;
	private String email;
	
	public Customer() {
	}

	public Customer(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name);
	}

// Soring by id	
	
//	@Override
//	public int compareTo(Customer c) {
//		
//		return this.id-c.id;
//	}
	
// Sorting by name
	
	@Override
	public int compareTo(Customer c) {
		
		return this.name.compareTo(c.name);
	}	
	
	
	
}
