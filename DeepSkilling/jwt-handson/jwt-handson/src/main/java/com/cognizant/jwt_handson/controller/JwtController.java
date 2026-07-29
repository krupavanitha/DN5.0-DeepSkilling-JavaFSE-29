package com.cognizant.jwt_handson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.jwt_handson.model.JwtResponse;
import com.cognizant.jwt_handson.model.User;
import com.cognizant.jwt_handson.service.JwtService;

@RestController
public class JwtController {

    @Autowired
    private JwtService jwtService;

    @PostMapping("/authenticate")
    public JwtResponse authenticate(@RequestBody User user) {
        return jwtService.generateToken(user);
    }
}