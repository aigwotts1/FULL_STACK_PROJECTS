package com.fullstackapp.controller;

import com.fullstackapp.model.User;
import com.fullstackapp.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    Service service;

    @PostMapping
    public ResponseEntity<User> loginUser(@RequestBody User user) {
        return new ResponseEntity<>(service.loginUser(user), HttpStatus.OK);
    }

}