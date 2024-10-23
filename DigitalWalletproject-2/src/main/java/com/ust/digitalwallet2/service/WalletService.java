package com.ust.digitalwallet2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.digitalwallet2.model.Document;
import com.ust.digitalwallet2.model.User;
import com.ust.digitalwallet2.repository.DocumentRepository;
import com.ust.digitalwallet2.repository.UserRepository;

import java.util.List;

@Service
public class WalletService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DocumentRepository documentRepository;

    // User operations
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(int id, User user) {
        user.setId(id);
        return userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    // Document operations
    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }

    public Document getDocumentById(int id) {
        return documentRepository.findById(id).orElse(null);
    }
    public Document addDocumentToUser(int userId, Document document) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            // Assign a new docId based on the current size of the user's documents
            int newDocId = user.getDocuments().size() + 1; 
            document.setDocId(newDocId); // Set the new docId
            document.setUser(user); // Associate document with user
            user.getDocuments().add(document); // Add document to user's document list
            userRepository.save(user); // Save user to persist the document
            return document; // Return the saved document
        }
        return null; // If user is not found, return null
    }
    public Document getDocumentByUserIdAndDocType(int userId, String docType) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            for (Document doc : user.getDocuments()) {
                if (doc.getDocType().equalsIgnoreCase(docType)) {
                    return doc; // Return the document if the type matches
                }
            }
        }
        return null; // Return null if user or document not found
    }


    public void deleteDocument(int id) {
        documentRepository.deleteById(id);
    }
}

