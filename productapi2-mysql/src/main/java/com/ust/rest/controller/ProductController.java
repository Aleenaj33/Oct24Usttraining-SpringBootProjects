package com.ust.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.model.Product;
import com.ust.rest.service.ProductService;

import org.springframework.web.bind.annotation.RequestBody;
import java.util.logging.Logger;

@RestController
@RequestMapping("/product/api1.0")//root of the resource or controller
public class ProductController {
	@Autowired
	ProductService service;
	
	Logger logger=Logger.getLogger("ProductController.class");
	
	
	@GetMapping(value="/product/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Product> getById(@PathVariable long id){
		
		return ResponseEntity.ok().body(service.getProduct(id));
			
		}
	
	@GetMapping(value="/productbrand/{brand}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> getByBrand(@PathVariable String brand){
		
		return ResponseEntity.ok().body(service.productByString(brand));
	}

	
	
	@GetMapping(value="/productsinfo",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> displayProducts(){
		
		return ResponseEntity.ok().body(service.getAllProducts());
		
	}
	
	@PostMapping(value="/addproduct",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		logger.info("Entered POST method" +product);
		Product savedProduct=service.addProduct(product);
		return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(savedProduct);
		
	
	}
	
	@PutMapping(value="/modify/{id}",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> updateProduct(@PathVariable long id,@RequestBody Product product){
		
		
		return ResponseEntity.ok().body(service.updateProduct(id,product));
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void removeProduct(@PathVariable long id) {
		service.deleteproduct(id);
		//return ResponseEntity.ok().body(service.deleteproduct(id));
		//return ResponseEntity.noContent().build();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@GetMapping("/status")
	public String status() {
		return "UP and Running...";
	}
	@GetMapping("/time")
	public String time() {
		return new java.util.Date().getTime()+"";
	}
	*/

}
