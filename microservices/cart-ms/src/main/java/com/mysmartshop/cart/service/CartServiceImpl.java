package com.mysmartshop.cart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.mysmartshop.cart.dto.CartDetails;
import com.mysmartshop.cart.dto.Product;
import com.mysmartshop.cart.model.CartItem;
import com.mysmartshop.cart.repository.CartItemRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
@Transactional
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartItemRepository itemRepository;
	
	@Autowired
	RestTemplate productServiceClient;

	@Override
	public List<CartItem> addToCart(String productId) {
		
		Optional<CartItem> checkItem = itemRepository.findByProductId(productId);
		
		if(!checkItem.isPresent()) {
			CartItem item = new CartItem();
			item.setProductId(productId);
			item.setQuantity(1);
			Product product = fetchProduct(productId);
			item.setTotalPrice(product.getProductPrice());
			item.setProductName(product.getProductName());
			itemRepository.save(item);
		}
		else {
			CartItem item = checkItem.get();
			updateQuantity(productId, item.getQuantity()+1);
		}
		
		return getAllItems();
	}

	private List<CartItem> getAllItems() {
		return itemRepository.findAll();
	}

	@Override
	public List<CartItem> removeFromCart(String productId) {
		
		Optional<CartItem> checkItem = itemRepository.findByProductId(productId);
		if(checkItem.isPresent()) {
			CartItem item = checkItem.get();
			itemRepository.delete(item);
		}
		
		
		return getAllItems();
	}

	@Override
	public List<CartItem> updateQuantity(String productId, int quantity) {
		
		Optional<CartItem> checkItem = itemRepository.findByProductId(productId);
		
		if(checkItem.isPresent()) {
			CartItem item = checkItem.get();
			float unitPrice = item.getTotalPrice()/item.getQuantity();
			item.setQuantity(quantity);
			item.setTotalPrice(unitPrice*quantity);
			itemRepository.save(item);
		}
		
		return getAllItems();
		
	}

	@Override
	public float calculateTotalCost() {
		return itemRepository.getTotalCartValue();
		
	}
	
	public CartDetails getCartDetails(){
		
		List<CartItem> items = itemRepository.findAll();
		if(items == null || items.isEmpty()) {
			return null;
		}
		float totalCartVlue = calculateTotalCost();
		CartDetails cartDetails = new CartDetails();
		cartDetails.setCartItems(items);
		cartDetails.setTotalCartValue(totalCartVlue);
		return cartDetails;
	}
	
	
	private Product fetchProduct(String productId) {
		System.out.println("Trying to fetch price from product service");
		Product product = productServiceClient.getForObject("http://product-ms/api/products/"+productId, Product.class);
		if(product != null)
			return product;
		return null;
	}
	
	@Override
	public void clearCart() {
		itemRepository.clearCartItems();
	}
	
//	private float fetchPriceFallback(String productId, Throwable t) {
//		Product product = new Product(productId,"Dummy Product",0,"A dummy product");
//		System.err.println(t.getMessage());
//		System.out.println("Response from Fallback");
//		System.out.println(product);
//		return product.getPrice();
//	}
	
	

}
