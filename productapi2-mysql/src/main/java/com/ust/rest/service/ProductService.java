package com.ust.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.model.Product;
import com.ust.rest.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public Product addProduct(Product newProduct) {
		return repository.save(newProduct);
	}
	
	public List<Product> getAllProducts() {
		return repository.findAll();
		}
	public Product getProduct(long id) {
	   Optional<Product> productoptional=repository.findById(id);
	   if(productoptional.isPresent())
	       return productoptional.get();
	   else
		   return null;
	}
	public void deleteproduct(long id) {
		repository.deleteById(id);
	}
	public Product updateProduct(long id,Product product) {
		//Optional<Product> productoptional=repository.findById(id);
		//if(productoptional.isPresent()) {
			product.setId(id);
			return repository.save(product);
		
	}
	
	public List<Product> productByString(String brand)
	{
		return repository.findByBrand(brand);
	}

}
