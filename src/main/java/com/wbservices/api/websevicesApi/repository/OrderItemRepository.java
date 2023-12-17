package com.wbservices.api.websevicesApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wbservices.api.websevicesApi.model.Order;

public interface OrderItemRepository extends JpaRepository<Order, Long> {
    
}
