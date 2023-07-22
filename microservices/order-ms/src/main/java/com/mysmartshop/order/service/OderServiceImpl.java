package com.mysmartshop.order.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysmartshop.order.model.CartItem;
import com.mysmartshop.order.model.Order;
import com.mysmartshop.order.repository.OrderRepository;

@Service
public class OderServiceImpl  implements OrderService{

	@Autowired
	private OrderRepository repo;
	
	@Override
	public Order getOrderDetails(String orderId) {
		return repo.findByOrderId(orderId);
	}
	
	@Override
	public Order placeOrder(List<CartItem> cartItems) {
		Order orderDetails = new Order();
		orderDetails.setOrderItems(cartItems);
		orderDetails.setStatus("Order Placed");
		Random rnd = new Random();
		int num = Math.abs((int)(rnd.nextDouble()*100000));
		String str = "n"+LocalDate.now().getMonthValue()+""+LocalDate.now().getDayOfMonth()+num;
		orderDetails.set_id(num);
		orderDetails.setOrderId(str);
		return repo.save(orderDetails);
	}
	
}
