package com.ust.bootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.bootsecurity.model.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
