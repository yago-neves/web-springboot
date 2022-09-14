package com.web.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.services.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
