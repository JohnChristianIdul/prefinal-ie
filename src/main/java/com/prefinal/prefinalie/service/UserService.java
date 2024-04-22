package com.prefinal.prefinalie.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.prefinal.prefinalie.models.User;
import com.prefinal.prefinalie.respositories.UserRepo;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public List<User> getUserbyFirstName(String firstname) {
        return userRepo.findByfirstname(firstname);
    }

    public List<User> getUserbyLastName(String lastname) {
        return userRepo.findBylastname(lastname);
    }

}
