package com.perfiltic.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfiltic.app.entities.User;
import com.perfiltic.app.repository.IUserRepository;

@Service
public class UserServiceimpl implements IUserService {

	@Autowired
	private IUserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User searchById(User user) {
		Optional<User> optionalUser = userRepository.findById(user.getId());
		if (optionalUser.isPresent()) {
			return optionalUser.get();
		}
		throw new RuntimeException("El usuario no existe");
	}

	@Override
	public void deleteUser(User user) {
		userRepository.deleteById(user.getId());
	}

	@Override
	public List<User> getUsers() {
		List<User> listOfUsers = new ArrayList<>();
		userRepository.findAll().forEach(p -> listOfUsers.add(p));
		return listOfUsers;
	}

}
