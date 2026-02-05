package com.panda.UserRole.controller;

import com.panda.UserRole.model.User;
import com.panda.UserRole.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService service;

    @Autowired
    UserController(UserService service){
        this.service = service;
    }

    @GetMapping("profile/{userName}")
    public ResponseEntity<User> viewProfile(@PathVariable String userName) throws Exception{
        return ResponseEntity.ok(this.service.viewProfile(userName));
    }

    @GetMapping("/profiles")
    public ResponseEntity<List<User>> getAllUsers() throws Exception{
        return ResponseEntity.ok(this.service.listAllUsers());
    }

    @DeleteMapping("/delete/{userName}")
    public ResponseEntity<String> deleteUser(@PathVariable String userName) throws Exception{
        return ResponseEntity.ok(this.service.deleteUser(userName));
    }
}
