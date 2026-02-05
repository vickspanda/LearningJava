package com.panda.UserRole.service;

import com.panda.UserRole.dto.LoginCreds;
import com.panda.UserRole.exception.UserNotFoundException;
import com.panda.UserRole.model.User;
import com.panda.UserRole.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginService {

    private final UserRepo repo;
    private final PasswordService service;

    @Autowired
    LoginService(UserRepo repo, PasswordService service){
        this.repo = repo;
        this.service = service;
    }

    boolean validateUser(String userName, String passWord) throws Exception
    {
        User user = repo.findByUserName(userName)
            .orElseThrow(() -> new UserNotFoundException("User" +userName+" Not Found"));
        return service.matches(passWord,user.getPassWord());
    }

    public String login(LoginCreds creds) throws Exception
    {
        if(validateUser(creds.getUserName(),creds.getPassWord()))
            return "Login Successful ...!!!";
        else
            return "Wrong Password ... !!!";
    }
}
