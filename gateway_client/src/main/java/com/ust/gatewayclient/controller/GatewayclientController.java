package com.ust.gatewayclient.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//import com.ust.client.model.Product;

@RestController
@RequestMapping("/gatewayclient")
public class GatewayclientController {
	@Autowired
	RestTemplate template;
	@GetMapping("/gettime")
	public String fetchtime()
	{
		String url="http://localhost:8072/rest/service/time";
		String list=template.getForObject(url,String.class);
		return list;
		
	}

}
