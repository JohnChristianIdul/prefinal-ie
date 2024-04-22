package com.prefinal.prefinalie.controller;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prefinal.prefinalie.models.User;
import com.prefinal.prefinalie.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/newUser")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/login/{firstname}/{lastname}")
    public List<User> getUserbyFirstNameandLastName(@PathVariable String firstname, String lastname) {
        return Stream.concat(userService.getUserbyFirstName(firstname).stream(),
                userService.getUserbyLastName(firstname).stream()).collect(Collectors.toList());
    }

}
