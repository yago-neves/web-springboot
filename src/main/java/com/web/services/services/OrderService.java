package com.web.services.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.services.entities.Order;
import com.web.services.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	public Order FindById(Long id) {
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
	}
}
