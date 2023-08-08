package com.mysmartshop.product.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	private String productId;
	private String productName;
	private float productPrice;
	private String productDescription;

//	private String imageUrl;

}
