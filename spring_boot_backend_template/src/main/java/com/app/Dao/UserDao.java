package com.app.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entities.User;

public interface UserDao extends JpaRepository<User, Long> {
	public Optional<User> findByEmail(String email); 
}
