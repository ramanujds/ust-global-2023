package com.mysmartshop.cart.dto;

import java.util.List;

import com.mysmartshop.cart.model.CartItem;

import lombok.Builder;
import lombok.Data;

@Data
public class CartDetails {

	private List<CartItem> cartItems;
	private float totalCartValue;
	
}
