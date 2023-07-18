package com.mysmartshop.cart.dto;



import lombok.Data;


@Data
public class Product {

	private String productId;
	private String name;
	private float price;
	private String description;

}
