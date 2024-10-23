package com.ust.digitalwallet2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ust.digitalwallet2.model.Document;
import com.ust.digitalwallet2.model.User;
import com.ust.digitalwallet2.service.WalletService;

import java.util.List;

@RestController
@RequestMapping("/api/wallet")
public class WalletController {
    @Autowired
    private WalletService walletService;

    // User endpoints
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return walletService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        User user = walletService.getUserById(id);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return walletService.createUser(user);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User user) {
        User updatedUser = walletService.updateUser(id, user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        walletService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    // Document endpoints
    @GetMapping("/documents")
    public List<Document> getAllDocuments() {
        return walletService.getAllDocuments();
    }

    @GetMapping("/documents/{id}")
    public ResponseEntity<Document> getDocumentById(@PathVariable int id) {
        Document document = walletService.getDocumentById(id);
        return document != null ? ResponseEntity.ok(document) : ResponseEntity.notFound().build();
    }

    @PostMapping("/users/{userId}/documents")
    public ResponseEntity<Document> addDocumentToUser(@PathVariable int userId, @RequestBody Document document) {
        Document addedDocument = walletService.addDocumentToUser(userId, document);
        return addedDocument != null ? ResponseEntity.ok(addedDocument) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/documents/{id}")
    public ResponseEntity<Void> deleteDocument(@PathVariable int id) {
        walletService.deleteDocument(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/users/{userId}/documents/{docType}")
    public ResponseEntity<Document> getDocumentByUserIdAndDocType(@PathVariable int userId, @PathVariable String docType) {
        Document document = walletService.getDocumentByUserIdAndDocType(userId, docType);
        if (document != null) {
            return ResponseEntity.ok(document);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
