package com.profilemanagement.service;

import java.util.List;

import com.profilemanagement.model.User;

public interface UserService {
	
	public User findByUsername(String username);
	
	public List<User> getAllUsers();

	public User addUser(User user);


}
