package com.example.newSection13.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;
@RestControllerAdvice
public class ExceptionController {


    @ExceptionHandler(BindException.class)
    public ResponseEntity<List> handleBindException(BindException ex){
        List errors = ex.getAllErrors().stream()
                .map(x->x.getDefaultMessage()).collect(Collectors.toList());
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

}
