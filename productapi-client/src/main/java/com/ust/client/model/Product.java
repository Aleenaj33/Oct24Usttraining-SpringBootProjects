package com.ust.client.model;
/*
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
*/
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Entity
public class Product {
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String brand;
	
	private String description;
	private int qty;
	private int price;
	

}
