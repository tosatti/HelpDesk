package com.tosatti.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tosatti.helpdesk.api.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);
	
}
