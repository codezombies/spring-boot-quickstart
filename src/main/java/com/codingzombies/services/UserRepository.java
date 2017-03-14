package com.codingzombies.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingzombies.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
