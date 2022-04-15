package com.profilemanagement.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.profilemanagement.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	 public List<User> findAll();
	    
	    public User findByUsername(String username);

}
