package com.example.exampleservice.response;

import com.example.examplecore.v1.core.models.User;

import java.util.Date;
import java.util.List;

//TODO Bug: Lombok doesn't work properly
public class UserResponse {
    private User user;
    private List<User> users;
    private String message;
    private final Date createdAt = new Date();

    public static UserResponse builder() {
        return new UserResponse();
    }

    public UserResponse user(User user) {
        this.user = user;
        return this;
    }

    public UserResponse users(List<User> users) {
        this.users = users;
        return this;
    }

    public UserResponse message(String message) {
        this.message = message;
        return this;
    }

    public UserResponse build(){
        return this;
    }

    public User getUser() {
        return user;
    }

    public List<User> getUsers() {
        return users;
    }
}
