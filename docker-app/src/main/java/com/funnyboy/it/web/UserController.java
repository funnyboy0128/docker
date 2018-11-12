package com.funnyboy.it.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.funnyboy.it.model.User;
import com.funnyboy.it.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Map<String,String> addUser(@RequestBody User user) {
		Map<String,String> result = new HashMap<String,String>();
		try {
			userService.add(user);
			result.put("status", "200");
		} catch (Exception e) {
			result.put("status", "-1");
		}
		
		return result;
	}
	
	@RequestMapping(value = "/findList", method = RequestMethod.GET)
	public Map<String,List<User>> findUserList() {
		
		Map<String,List<User>> result = new HashMap<String,List<User>>();
		try {
			List<User> users = userService.findList();
			result.put("data", users);
		} catch (Exception e) {
			result.put("data", null);
		}
		return result;
	}
	
}
