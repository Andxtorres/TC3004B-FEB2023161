package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/hello-world")
public class HelloWorldController {

    @GetMapping("/say-hello")
    public ResponseEntity<Map<String,String>> sayHello(){
        Map<String,String> response= new HashMap<>();
        response.put("message","Hello world");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
