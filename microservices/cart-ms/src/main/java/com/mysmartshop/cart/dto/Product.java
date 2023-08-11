package com.mysmartshop.cart.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private String productId;
	private String productName;
	private float productPrice;
	private String productDescription;

}
