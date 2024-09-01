package com.passuello.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.passuello.course.entities.OrderItem;
import com.passuello.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
