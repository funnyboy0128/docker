package com.funnyboy.it.repository;

import org.springframework.data.repository.CrudRepository;

import com.funnyboy.it.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
