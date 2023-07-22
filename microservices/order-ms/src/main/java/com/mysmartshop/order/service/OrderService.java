package com.mysmartshop.order.service;

import java.util.List;

import com.mysmartshop.order.model.CartItem;
import com.mysmartshop.order.model.Order;

public interface OrderService {

	/*
	 * 
	 *  +placeOrder(cartItems: List<CartItem>): Order
  		+getOrderDetails(orderId: String): Order
  		+updateOrderStatus(orderId: String, status: String): void
  		+cancelOrder(orderId: String): void
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Order placeOrder(List<CartItem> cartItems);
	
	public Order getOrderDetails(String orderId);
	
	
	
	
}
