package com.customerapp.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.customerapp.model.Customer;

public class CustomerRepoJdbcImpl implements CustomerRepo {
	
	Connection connection;
	String url;
	String username;
	String password;
	
	

	@Override
	public Customer addCustomer(Customer c) {
		
		url = "jdbc:mysql://localhost:3306/ust_db";
		username = "root";
		password = "password";
		
		try {
			connection = DriverManager.getConnection(url,username,password);
			
			String sql = "insert into customer values("+c.getId()+",'"
								+c.getName()+"','"
								+c.getEmail()+"')";
			
			Statement stmt = connection.createStatement();
			
			int count = stmt.executeUpdate(sql);
			
			return c;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
