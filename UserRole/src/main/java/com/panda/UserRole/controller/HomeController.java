package com.panda.UserRole.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public ResponseEntity<String> greet(){return ResponseEntity.ok("Welcome to the User Roles Demo ... !!!");}
}
