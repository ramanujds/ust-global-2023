package com.ust.customerapp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer_data") // optional, sets a name for the database table
public class Customer {
	@Id
	private int id;
	@Column(name = "customer_name", length = 50, nullable = false)
	private String customerName;
	@Column(unique = true)
	private String email;
	private LocalDate dob;
}
