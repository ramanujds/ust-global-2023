package com.springboot3app.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import com.springboot3app.dto.MenuItem;

public interface MenuItemClientService {

	@GetExchange("/items")
	public List<MenuItem> fetchMenuItems();
	
	@PostExchange("/items")
	public MenuItem addMenuItem(@RequestBody MenuItem item);
	
}
