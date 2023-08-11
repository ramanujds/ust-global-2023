package com.mysmartshop.cart.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.mysmartshop.cart.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Integer> {

	public Optional<CartItem> findByProductId(String productId);
	
	@Query(value = "select sum(total_price) from cart_item",nativeQuery = true)
	public float getTotalCartValue();
	
	@Query(value = "delete from CartItem")
	@Modifying
	public void clearCartItems();
	
}
