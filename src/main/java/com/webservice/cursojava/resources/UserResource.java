package com.webservice.cursojava.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.cursojava.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findall() {
		User u = new User(1L, "maria", "maria@gmail.com", "99999999", "123456");
		return ResponseEntity.ok().body(u);
	}
	

}
