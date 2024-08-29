package com.passuello.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.passuello.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
