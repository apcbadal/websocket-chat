package com.example.chat.service;

import com.example.chat.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User save(User user);
    User findByUsername(String username);
    // Add method for user registration
    User registerUser(String username);
}
