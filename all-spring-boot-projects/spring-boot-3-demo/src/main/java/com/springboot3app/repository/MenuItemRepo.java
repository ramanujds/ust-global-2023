package com.springboot3app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot3app.model.MenuItem;



public interface MenuItemRepo extends JpaRepository<MenuItem, Integer> {

}
