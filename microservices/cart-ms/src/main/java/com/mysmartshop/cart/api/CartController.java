package com.mysmartshop.cart.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
		List<CartItem> items = cartService.getAllItems();
		float totalCartVlue = cartService.calculateTotalCost();
		CartDetails cartDetails = new CartDetails();
		cartDetails.setItemsList(items);
		cartDetails.setTotalCartValue(totalCartVlue);
		return cartDetails;
		
	}
	
	@PostMapping("/items/product/{productId}")
	public List<CartItem> addNewItem(@PathVariable String productId){
		return cartService.addToCart(productId);
	}
	
	@DeleteMapping("/items/product/{productId}")
	public List<CartItem> deleteItem(@PathVariable String productId){
		return cartService.removeFromCart(productId);
	}

}