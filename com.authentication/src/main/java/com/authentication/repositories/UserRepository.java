package com.authentication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authentication.entities.User;

public interface UserRepository 
	       extends JpaRepository<User ,Long> {
	
	public User findByUsername(String username);
	

}
