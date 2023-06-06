package com.springboot3app.service;

import java.util.List;

import com.springboot3app.model.MenuItem;

public interface MenuItemService {

	public MenuItem addToMenu(MenuItem item);
	
	public List<MenuItem> getFromMenuItem();
	
}
