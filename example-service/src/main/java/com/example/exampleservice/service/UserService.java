package com.example.exampleservice.service;

import com.example.examplecore.v1.core.models.User;
import com.example.exampleservice.exception.UserException;
import com.example.exampleservice.repository.UserRepository;
import com.example.exampleservice.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(@Autowired UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserResponse createUser(User user){
        try {
            User persistedUser = this.userRepository.save(user);
            return UserResponse.builder().user(persistedUser).message("User created successfully").build();
        } catch (Exception e){
            throw new UserException("There were a failure when trying to save the user: " + e.getMessage());
        }
    }

    public UserResponse getAllUser(){
        try {
            List<User> users = this.userRepository.findAll();
            return UserResponse.builder().build();
        } catch (Exception e){
            throw new UserException("There were a failure when trying to get all users: " + e.getMessage());
        }
    }

    public UserResponse getUserById(Long id){
        try {
            User user = this.userRepository.findById(id).get();
            return UserResponse.builder().user(user).message("").build();
        } catch (Exception e){
            throw new UserException("There were a failure when trying to get an user by id: " + e.getMessage());
        }
    }

    public void updateUser(User user){
        try {
            this.userRepository.save(user);
        } catch (Exception e){
            throw new UserException("There were a failure when trying to update the user: " + e.getMessage());
        }
    }

    public void deleteUser(Long id){
        this.userRepository.deleteById(id);
    }
}
