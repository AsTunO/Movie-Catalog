package com.astuno.moviecatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.astuno.moviecatalog.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
	
}
