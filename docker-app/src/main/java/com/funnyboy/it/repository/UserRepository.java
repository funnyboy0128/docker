package com.funnyboy.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.funnyboy.it.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
