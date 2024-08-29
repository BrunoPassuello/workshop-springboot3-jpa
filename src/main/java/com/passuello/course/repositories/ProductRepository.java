package com.passuello.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.passuello.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
