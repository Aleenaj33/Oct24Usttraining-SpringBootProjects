package com.ust.dockerexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dockercontroller {
	@GetMapping("/greet")
	public String message() {
		return "hello";
	}

}
