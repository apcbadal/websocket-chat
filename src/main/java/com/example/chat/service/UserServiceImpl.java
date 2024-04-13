package com.example.chat.service;

import com.example.chat.model.User;
import com.example.chat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User registerUser(String username) {
        // Check if the username already exists
        if (findByUsername(username) != null) {
            throw new IllegalArgumentException("Username already exists");
        }
        // Create a new user
        User user = new User();
        user.setUsername(username);
        // Save the user into the database
        return save(user);
    }
}
