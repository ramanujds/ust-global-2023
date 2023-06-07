package com.springboot3app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot3app.dto.MenuItem;
import com.springboot3app.service.MenuItemClientService;

@RestController
public class MenuItemClientController {

	@Autowired
	MenuItemClientService menuClient;
	
	@GetMapping("/items")
	public List<MenuItem> fetchMenuItems() {
		return menuClient.fetchMenuItems();
	}
	
	@PostMapping("/items")
	public MenuItem addMenuItem(@RequestBody MenuItem item) {
		return menuClient.addMenuItem(item);
	}
	
}
