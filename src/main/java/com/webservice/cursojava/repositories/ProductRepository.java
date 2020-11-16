package com.webservice.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.cursojava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
