package com.ust.bootsecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.bootsecurity.service.MyUser;

public interface UserRepository extends JpaRepository<MyUser,Long> {
	Optional<MyUser> findByUsername(String username);

}
