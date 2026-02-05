package com.panda.UserRole.controller;

import com.panda.UserRole.dto.LoginCreds;
import com.panda.UserRole.service.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private final LoginService service;

    LoginController(LoginService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginCreds creds) throws Exception
    {
        return ResponseEntity.ok(this.service.login(creds));
    }
}
