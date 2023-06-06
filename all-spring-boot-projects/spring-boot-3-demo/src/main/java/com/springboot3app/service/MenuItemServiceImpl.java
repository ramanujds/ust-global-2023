package com.springboot3app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot3app.model.MenuItem;
import com.springboot3app.repository.MenuItemRepo;

@Service
public class MenuItemServiceImpl implements MenuItemService {

	@Autowired
	private MenuItemRepo repo;
	
	@Override
	public MenuItem addToMenu(MenuItem item) {
		return repo.save(item); 
	}
	
	@Override
	public List<MenuItem> getFromMenuItem() {
		return repo.findAll();
	}
	
}
