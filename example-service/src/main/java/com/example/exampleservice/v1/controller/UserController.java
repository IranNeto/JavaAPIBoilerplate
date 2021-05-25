package com.example.exampleservice.v1.controller;

import com.example.examplecore.v1.core.models.User;
import com.example.examplecore.v1.resource.UserResource;
import com.example.exampleservice.response.UserResponse;
import com.example.exampleservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class UserController implements UserResource {

    UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<Object> getAllUsers() {
        try {
            UserResponse userResponse = this.userService.getAllUser();
            return ResponseEntity.ok(userResponse);
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public ResponseEntity<Object> getUserById(Long id) {
        try {
            UserResponse userResponse = this.userService.getUserById(id);
            return ResponseEntity.ok(userResponse);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ResponseEntity<Object> addUser(User user) {
        try {
            UserResponse userResponse = this.userService.createUser(user);
            return ResponseEntity
                    .created(URI.create(USER_URI + "/" + userResponse.getUser().getId()))
                    .body(userResponse);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ResponseEntity<Object> updateUser(User user) {
        try {
            this.userService.updateUser(user);
            return ResponseEntity.accepted().build();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ResponseEntity<Object> deleteUser(Long id) {
        try {
            this.userService.deleteUser(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            throw e;
        }
    }
}
