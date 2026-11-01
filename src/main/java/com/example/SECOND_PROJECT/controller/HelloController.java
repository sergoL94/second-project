package com.example.SECOND_PROJECT.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<?> hello(){
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity<?> test(){
        return new ResponseEntity<>("TEST", HttpStatus.OK);
    }


}