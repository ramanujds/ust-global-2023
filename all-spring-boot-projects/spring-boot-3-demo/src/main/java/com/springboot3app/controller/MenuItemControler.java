package com.springboot3app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot3app.model.MenuItem;
import com.springboot3app.service.MenuItemService;

@RestController
public class MenuItemControler {
	
	@Autowired
	private MenuItemService service;

	@PostMapping("/items")
	public MenuItem addMenuItem(@RequestBody MenuItem item) {
	
		return service.addToMenu(item);
	}
	
	@GetMapping("/items")
	public List<MenuItem> getAllItems(){
		return service.getFromMenuItem();
	}
	
	
}
