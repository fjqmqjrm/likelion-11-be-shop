package com.likelion.beshop.repository;


import com.likelion.beshop.entity.Item;
import com.likelion.beshop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {



}
