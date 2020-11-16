package com.webservice.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.cursojava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
