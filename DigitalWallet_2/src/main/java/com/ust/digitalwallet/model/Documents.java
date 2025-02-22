package com.ust.digitalwallet.model;

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
public class Documents {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int docid;
	String doctype;
	String doccredential;
	String issuedate;
	String expirydate;

}
