package com.webservice.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.cursojava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
