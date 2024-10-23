package com.ust.feignclient.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.feignclient.interfaces.ProductFeignInterface;
import com.ust.feignclient.model.Product;

@RestController
@RequestMapping("/client")
public class FeignClient {
	
	@Autowired
	private ProductFeignInterface feignclient;
	
	@GetMapping("/products")
	public List<Product> getAll()
	{
		return feignclient.getAllProducts();
	}
	
	@GetMapping("/productid/{id}")
	public Product singleproduct(@PathVariable long id)
	{
		return feignclient.productbyid(id);
	}
	
	@GetMapping("/productbybrand/{brand}")
	public Product getproductsbybrand(@PathVariable String brand)
	{
		return feignclient.productbybrand(brand);
	}
	
	
}
