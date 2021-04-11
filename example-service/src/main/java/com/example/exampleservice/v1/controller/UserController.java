package com.example.exampleservice.v1.controller;

import com.example.examplecore.v1.core.models.User;
import com.example.examplecore.v1.resource.UserResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserResource {

    @Override
    public ResponseEntity<Object> getAllUsers() {
        return null;
    }

    @Override
    public ResponseEntity<Object> getUserById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<Object> addUser(User user) {
        return null;
    }

    @Override
    public ResponseEntity<Object> updateUser(User user) {
        return null;
    }

    @Override
    public ResponseEntity<Object> deleteUser(String id) {
        return null;
    }
}
