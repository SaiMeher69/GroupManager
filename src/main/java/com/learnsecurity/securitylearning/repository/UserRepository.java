package com.learnsecurity.securitylearning.repository;

import com.learnsecurity.securitylearning.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUserName(String username);

}
