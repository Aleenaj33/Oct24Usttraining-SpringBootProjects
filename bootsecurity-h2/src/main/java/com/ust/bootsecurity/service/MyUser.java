package com.ust.bootsecurity.service;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
	
	@Entity
	public class MyUser {
    	@Id
    	@GeneratedValue(strategy = GenerationType.AUTO)
    	private Long id;
    	private String username;
    	private String password;
    	private String role;
}
