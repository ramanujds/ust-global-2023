package com.mysmartshop.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysmartshop.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, String>{

}
