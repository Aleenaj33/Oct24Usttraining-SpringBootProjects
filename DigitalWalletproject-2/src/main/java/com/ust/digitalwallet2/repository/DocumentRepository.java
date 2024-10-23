package com.ust.digitalwallet2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.digitalwallet2.model.Document;

public interface DocumentRepository extends JpaRepository<Document, Integer> {}