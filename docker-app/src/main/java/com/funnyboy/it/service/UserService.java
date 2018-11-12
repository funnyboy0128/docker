package com.funnyboy.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funnyboy.it.model.User;
import com.funnyboy.it.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void add(User user) {
		userRepository.save(user);
	}
	
	public List<User> findList(){
		return userRepository.findAll();
	}

}
