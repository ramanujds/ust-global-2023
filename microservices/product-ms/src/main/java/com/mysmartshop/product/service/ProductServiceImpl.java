package com.mysmartshop.product.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysmartshop.product.model.Product;
import com.mysmartshop.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public List<Product> getAvailableProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product getProductDetails(String productId) {
		return productRepo.findById(productId).get();
	}

	@Override
	public Product addProduct(Product product) {
		product.setProductId(generateProductId());
		return productRepo.save(product);
	}

	@Override
	public void removeProduct(String productId) {
		productRepo.deleteById(productId);
	}
	
	private String generateProductId() {
		Random rnd = new Random();
		double value = rnd.nextDouble()*100000;
		String productId = "p"+(int)value;
		return productId;
	}

}
