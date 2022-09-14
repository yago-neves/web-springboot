package com.web.services.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.services.entities.User;
import com.web.services.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User FindById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}
}
