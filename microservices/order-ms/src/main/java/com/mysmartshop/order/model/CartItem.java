package com.mysmartshop.order.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CartItem {

	private int cartId;
	private String productId;
	private String productName;
	private int quantity;
	private float totalPrice;
	
}
