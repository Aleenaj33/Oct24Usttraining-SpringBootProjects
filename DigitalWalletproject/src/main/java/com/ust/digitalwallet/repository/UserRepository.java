package com.ust.digitalwallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.digitalwallet.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
