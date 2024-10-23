package com.ust.digitalwallet2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.digitalwallet2.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {}

