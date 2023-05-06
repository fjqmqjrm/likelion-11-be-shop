package com.likelion.beshop.repository;

import com.likelion.beshop.entity.Order;
import com.likelion.beshop.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
