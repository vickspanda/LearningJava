package com.panda.UserRole.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {
    private final BCryptPasswordEncoder encoder;

    @Autowired
    PasswordService(BCryptPasswordEncoder encoder){
        this.encoder = encoder;
    }

    public String hashPassword(String passWord) throws Exception{
        return encoder.encode(passWord);
    }

    public boolean matches(String dbPassWord, String uPassWord) {
        return encoder.matches(dbPassWord,uPassWord);
    }
}
