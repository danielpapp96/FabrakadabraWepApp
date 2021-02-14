package com.fabrakadabra.webapp.repository;

import com.fabrakadabra.webapp.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}