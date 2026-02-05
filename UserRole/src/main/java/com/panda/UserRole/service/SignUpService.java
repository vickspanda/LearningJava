package com.panda.UserRole.service;

import com.panda.UserRole.exception.UserAlreadyExistsException;
import com.panda.UserRole.model.User;
import com.panda.UserRole.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {

    private final UserRepo repo;
    private final PasswordService service;

    @Autowired
    SignUpService(UserRepo repo, PasswordService service){
        this.repo = repo;
        this.service = service;
    }

    public String registerUser(User user) throws Exception {
            if (repo.existsByUserName(user.getUserName()))
                throw new UserAlreadyExistsException("Username "+user.getUserName()+" is already taken ... !!!");
            user.setPassWord(service.hashPassword(user.getPassWord()));
            repo.save(user);
            return "Registration Successful ...!!!";
    }
}
