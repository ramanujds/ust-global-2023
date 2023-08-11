package com.mysmartshop.cart.service;

import java.util.List;

import com.mysmartshop.cart.dto.CartDetails;
import com.mysmartshop.cart.model.CartItem;

public interface CartService {
	
	  public List<CartItem> addToCart(String productId);
	  public List<CartItem> removeFromCart(String productId);
	  public List<CartItem> updateQuantity(String productId, int quantity);
	  public float calculateTotalCost();
	  public CartDetails getCartDetails();
	  public void clearCart();

}
