package com.fullstackapp.service;

import com.fullstackapp.model.User;
import com.fullstackapp.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repository;

    public User loginUser(User user) {

        return repository.save(user);

    }
}
