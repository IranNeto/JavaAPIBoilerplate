package com.example.exampleservice.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserException extends RuntimeException {

    private String message;

    public UserException(String message){
        super();
        this.message = message;
    }
}
