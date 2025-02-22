package com.ust.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/readprops")
public class UseConfigController {
	@Value("${server.port.key}")
	String serverPort;
	@Value("${spring.application.name}")
	String appName;
	@Value("${message}")
	String msg;
	@GetMapping
		public String showprops() {
		return "port =  "+serverPort+ "  AppName  "+appName+"  Message is  "+ msg;
		
	}
	}
	
	


