package com.microservice.apigatewaymicroservice.jwt.repository;

import com.microservice.apigatewaymicroservice.jwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
