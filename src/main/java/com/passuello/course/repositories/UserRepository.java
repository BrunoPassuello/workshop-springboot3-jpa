package com.passuello.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.passuello.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
