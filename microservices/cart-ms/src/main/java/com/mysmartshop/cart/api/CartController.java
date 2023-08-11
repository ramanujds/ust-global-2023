package com.mysmartshop.cart.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mysmartshop.cart.dto.CartDetails;
import com.mysmartshop.cart.model.CartItem;
import com.mysmartshop.cart.service.CartService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/api/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	
	@GetMapping
	public String greet() {
		return "Message from Cart Service";
	}
	
	@GetMapping("/items")
	public CartDetails getCartDetails() {
		return cartService.getCartDetails();
		
	}
	
	@PostMapping("/items/product/{productId}")
//	@CircuitBreaker(fallbackMethod = "addNewItemFallback", name = "cb-product")
//	@Retry(name = "retry-fetch-product", fallbackMethod = "addNewItemFallback")
	public List<CartItem> addNewItem(@PathVariable String productId){
		return cartService.addToCart(productId);
	}
	
	
	public List<CartItem> addNewItemFallback(@PathVariable String productId, Throwable t){
		System.err.println(t.getMessage());
		return new ArrayList<CartItem>();
	}
	
	
	@DeleteMapping("/items/product/{productId}")
	public List<CartItem> deleteItem(@PathVariable String productId){
		return cartService.removeFromCart(productId);
	}
	
	@DeleteMapping("/items")
	public void clearCart() {
		cartService.clearCart();
	}

}