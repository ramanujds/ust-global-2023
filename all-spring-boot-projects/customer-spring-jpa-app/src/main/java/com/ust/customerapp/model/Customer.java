package com.ust.customerapp.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
// @Table(name = "customer_data") // optional, sets a name for the database table
public class Customer {
	@Id
	@NotNull(message = "Id should have a value")
	@Min(value = 100, message = "Id should be of 3 digits")
	@Max(value = 999, message = "Id should be of 3 digits")
	private int id;
	
	@NotBlank
	@Pattern(regexp =  "[a-zA-Z\\s]+", message = "Name should contain only characters")
	@Column(name = "customer_name", length = 50, nullable = false)
	private String customerName;
	@Column(unique = true)
	@Email(message = "Email is invaild")
	private String email;
	
	@JsonProperty("birthDate")
	@Past(message = "Birth Date should not be a future date")
	private LocalDate dob;
	
	@Enumerated(EnumType.STRING)
	private UserType type;
	
//	@ElementCollection
//	List<String> address;
//	@OneToOne(cascade = CascadeType.ALL)
//	Address address;
	
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	List<Address> addresses;
	
}
