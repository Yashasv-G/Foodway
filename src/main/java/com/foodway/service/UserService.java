
package com.foodway.foodway.service;

import com.foodway.foodway.model.User;
import com.foodway.foodway.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User authenticateUser(User user) {
        return userRepository.findByUsername(user.getUsername());
    }
}
