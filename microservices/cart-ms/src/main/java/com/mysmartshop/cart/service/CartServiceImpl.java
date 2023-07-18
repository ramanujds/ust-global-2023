package com.mysmartshop.cart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mysmartshop.cart.dto.Product;
import com.mysmartshop.cart.model.CartItem;
import com.mysmartshop.cart.repository.CartItemRepository;

@Service
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
			item.setTotalPrice(fetchPrice(productId));
			itemRepository.save(item);
		}
		else {
			CartItem item = checkItem.get();
			updateQuantity(productId, item.getQuantity()+1);
		}
		
		return getAllItems();
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
			item.setQuantity(quantity);
			item.setTotalPrice(item.getTotalPrice()*quantity);
			itemRepository.save(item);
		}
		
		return getAllItems();
		
	}

	@Override
	public float calculateTotalCost() {
		return itemRepository.getTotalCartValue();
		
	}
	
	public List<CartItem> getAllItems(){
		return itemRepository.findAll();
	}
	
	
	private float fetchPrice(String productId) {
		
		Product product = productServiceClient.getForObject("http://product-ms/api/product/"+productId, Product.class);
		if(product != null)
			return product.getPrice();
		return 0;
	}
	
	

}
