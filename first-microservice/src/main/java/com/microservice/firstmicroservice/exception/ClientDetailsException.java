package com.microservice.firstmicroservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ClientDetailsException {

    private static final long serialVersionUID = 1L;

    @ExceptionHandler(value = ClientDetailsEmptyException.class)
    public ResponseEntity<Object> exception(ClientDetailsEmptyException exception) {

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getMessage());
    }




}
