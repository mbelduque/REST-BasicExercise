package com.perfiltic.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.perfiltic.app.entities.User;
import com.perfiltic.app.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;

	@RequestMapping(method = RequestMethod.POST)
	public User saveUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<User> findAll() {
		return userService.getUsers();
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteUser(@RequestBody User user) {
		userService.deleteUser(user);
	}

}
