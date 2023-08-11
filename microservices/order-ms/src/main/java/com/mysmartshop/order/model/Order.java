package com.mysmartshop.order.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Document
public class Order {

	@Id
	@JsonProperty("id")
	private int _id;
	private String orderId;
	private List<CartItem> orderItems;
	private String status;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dateOrdered;
	private double totalOrderValue;	

}
