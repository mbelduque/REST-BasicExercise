package com.perfiltic.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.perfiltic.app.entities.User;

@Service
public interface IUserService {

	User createUser(User user);

	User updateUser(User user);

	User searchById(User user);

	void deleteUser(User user);

	List<User> getUsers();

}
