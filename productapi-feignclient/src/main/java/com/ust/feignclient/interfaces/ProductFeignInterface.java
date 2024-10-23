package com.ust.feignclient.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ust.feignclient.model.Product;

@FeignClient(value="productfeignclient",url="http://localhost:8090/product/api1.0")
public interface ProductFeignInterface {
	
	@GetMapping("/productsinfo")
	public List<Product> getAllProducts();
	
	@GetMapping("/productbrand/{brand}")
	public Product productbybrand(@PathVariable String brand);
	
	
	@GetMapping("/product/{id}")
	public Product productbyid(@PathVariable long id);	
	
	@PostMapping(value="/addproduct")
	public Product addoneproduct(@RequestBody Product product);
	
	
	
	
	

}
