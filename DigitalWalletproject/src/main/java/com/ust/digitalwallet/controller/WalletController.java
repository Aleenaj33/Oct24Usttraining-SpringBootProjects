package com.ust.digitalwallet.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.digitalwallet.model.Documents;
import com.ust.digitalwallet.model.User;
import com.ust.digitalwallet.repository.UserRepository;

//import com.ust.digitalwallet.service.Walletservice;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    private UserRepository userRepository;
    //private Walletservice walletservice;
	
	@GetMapping("/getallusers")
	public List<User> getAllusers(){
		return userRepository.findAll();
	}
	
	@GetMapping("userby/{id}")
	public User getUserbyId(@PathVariable int id) {
		Optional<User> useroptional= userRepository.findById(id);
		if(useroptional.isPresent()) {
			return useroptional.get();		
	}else
		return null;
   }
   
	@GetMapping("userby/{id}/{doctype}")
	public Documents getuserbydoctype(@PathVariable int id,@PathVariable String doctype) {
		Optional<User> useroptional= userRepository.findById(id);
		if(useroptional.isPresent()) {
			HashMap<Integer,Documents> docs=useroptional.get().getDocuments();
			docs.forEach((key,value)->
		}
		
	}
	
	
	
	
	@PostMapping("/adduser")
	public User createnewuser(@RequestBody User user) {
		return userRepository.save(user);
	}
}
