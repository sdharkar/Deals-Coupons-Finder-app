package com.profilemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profilemanagement.Repository.UserRepository;
import com.profilemanagement.exceptions.UserNameAlreadyExists;
import com.profilemanagement.exceptions.UserNotFoundException;
import com.profilemanagement.model.User;
import com.profilemanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findByUsername(String username) {
		User customer = userRepository
                .findAll()
                .stream()
                .filter(a -> a.getUsername().equalsIgnoreCase(username))
                .findAny().orElse(null);
		if (customer == null) {
			throw new UserNotFoundException("Sorry, Customer with the provided Username not found" +
					",Please provide the correct Username");
		}
		else {
			return userRepository.findByUsername(username);
		}
	}

	@Override
	public List<User> getAllUsers() {
		List<User> customer = userRepository.findAll();
		return user;
	}

	@Override
	public User addUser(User user) {

		user.setRole("default.png");
		user.setRole("User");
		User user1 = this.userRepository.findByUsername(user.getUsername());
		if (user1 != null) {
			System.out.println("Customer is already there !!");
			throw new UserNameAlreadyExists("Username already present!!!");

		}
		else {
		System.out.println(user);
		return userRepository.save(user);
		}
	}


}
