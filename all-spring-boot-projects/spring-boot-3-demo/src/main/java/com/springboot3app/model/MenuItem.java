package com.springboot3app.model;





import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class MenuItem {
	
	@Id
	private int id;
	@NotNull(message = "Name cannot be null")
	private String name;
	
	@Min(value = 1, message = "Minimum Price should be 1")
	private double price;

}
