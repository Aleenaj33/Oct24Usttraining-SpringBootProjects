package com.ust.factorialservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/factorialservice")
public class Factorialservicecontroller {

	@GetMapping("/number/{num}")
	public int factorial(@PathVariable int num) {
	   int fact=1;
	   if(num==0)
		   return 1;
		   
	   else
	   {
	   for(int i=1;i<=num;i++) {
		   fact=fact*i;
	   }
	   }
	   return fact;
	
	}
}

