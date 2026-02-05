package com.panda.UserRole.repo;

import com.panda.UserRole.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    boolean existsByUserName(String userName);
    Optional<User> findByUserName(String userName);
}
