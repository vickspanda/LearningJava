package com.panda.UserRole.controller;

import com.panda.UserRole.model.User;
import com.panda.UserRole.service.SignUpService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {

    private final SignUpService service;

    SignUpController(SignUpService service){
        this.service = service;
    }

    @PostMapping("/signup")
    public String registerUser(@RequestBody User user) throws Exception {
        return this.service.registerUser(user);
    }
}
