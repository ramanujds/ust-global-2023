package com.mysmartshop.product.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysmartshop.product.model.Product;
import com.mysmartshop.product.service.ProductService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
//	@GetMapping
//	public String greet() {
//		return "Message from Product Service";
//	}
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		
		return productService.addProduct(product);
	}

	// create an api to return a Mono<Product> by id
//	public Mono<Product> getProductById(String id) {
//		Product p = productService.getProductDetails(id);
//		return Mono.just(p);
//	}


	
	@GetMapping("/{id}")
	public Product getProductDeatils(@PathVariable String id) {
		return productService.getProductDetails(id);
	}
	
	@GetMapping
	public List<Product> getAllProducts(){
		return productService.getAvailableProducts();
	}

}
