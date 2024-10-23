package com.codingninjas.EVotingSystem.controllers;

import com.codingninjas.EVotingSystem.entities.User;
import com.codingninjas.EVotingSystem.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/get/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/add/user")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
