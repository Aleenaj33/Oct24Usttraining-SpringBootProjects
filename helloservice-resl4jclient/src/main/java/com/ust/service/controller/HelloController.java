package com.ust.service.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/api/client")
public class HelloController {
	
	
	@Autowired
	RestTemplate template;
	public final static String CLIENT_SERVICE="clientService";
	
	@GetMapping
	@CircuitBreaker(name = CLIENT_SERVICE,fallbackMethod= "callOnFail")
	public String callServer() {
		String url="http://localhost:8094/rest/service/time";
		String output=template.getForObject(url, String.class);
		return output;
				
	}
	public String callOnFail(Exception e) {
		return "message from callONFail()....";
				}
	
	
	
//	@Autowired
//	Environment environment;
//	
//	@GetMapping("/test")
//	public String hello() {
//		return "hello.. its connected";
//	}
//	@GetMapping
//	public String message() {
//		return "from port # "+environment.getProperty("local.server.port");
//	}
//
//	
//	@GetMapping("/time")
//	public String time1() {
//		return "Hey its 4.00 PM .Go and have your tea";
//		
//	}
//	

}
