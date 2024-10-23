package com.ust.digitalwallet.model;

import java.util.HashMap;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int Userid;
	String Name;
	HashMap<Integer,Documents> documents=new HashMap<>();
}
