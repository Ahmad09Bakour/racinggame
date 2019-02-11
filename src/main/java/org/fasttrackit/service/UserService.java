package org.fasttrackit.service;

import org.fasttrackit.domain.User;
import org.fasttrackit.persistance.UserRepository;

import java.security.PublicKey;

public class UserService {

    private UserRepository userRepository = new UserRepository();

    public User createUser(User user) {
        System.out.println("Creating users: " + user);
        return userRepository.createUser(user);
    }
}
