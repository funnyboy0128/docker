package com.funnyboy.it.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.funnyboy.it.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private RestTemplate restTemplate;
	

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Map<String,String> addUser(@RequestBody User user) {
		Map<String,String> result = new HashMap<String,String>();
		
		return result;
	}
	
	@RequestMapping(value = "/findList", method = RequestMethod.GET)
	public Map<String,List<User>> findUserList() {
		
		Map<String,List<User>> result = new HashMap<String,List<User>>();
		return result;
	}
	
}
