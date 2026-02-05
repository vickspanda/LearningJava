package com.panda.UserRole.service;

import com.panda.UserRole.exception.UserNotFoundException;
import com.panda.UserRole.model.User;
import com.panda.UserRole.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    private final UserRepo repo;

    @Autowired
    UserService(UserRepo repo){
        this.repo = repo;
    }

    public User viewProfile(String userName) throws Exception{
        User user = repo.findByUserName(userName)
                .orElseThrow(() -> new UserNotFoundException("User "+userName+" Not Found"));
        return user;
    }

    public List<User> listAllUsers() throws Exception{
        return repo.findAll();
    }

    @Transactional
    public String deleteUser(String userName) throws Exception{
        User user = repo.findByUserName(userName)
                .orElseThrow(() -> new UserNotFoundException("User "+ userName +" not found"));

        repo.delete(user);
        return "User deleted successfully!";
    }
}
