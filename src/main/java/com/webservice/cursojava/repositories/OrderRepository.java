package com.webservice.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.cursojava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
