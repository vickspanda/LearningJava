package com.panda.UserRole.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordConfig extends BCryptPasswordEncoder {
}
