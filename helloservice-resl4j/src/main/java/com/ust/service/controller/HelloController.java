package com.ust.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class HelloController {
	@Autowired
	Environment environment;
	
	@GetMapping("/test")
	public String hello() {
		return "hello.. its connected";
	}
	@GetMapping
	public String message() {
		return "from port # "+environment.getProperty("local.server.port");
	}

	
	@GetMapping("/time")
	public String time1() {
		return "Hey its 4.00 PM .Go and have your tea";
		
	}
	

}
