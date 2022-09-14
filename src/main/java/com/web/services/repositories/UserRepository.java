package com.web.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.services.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
