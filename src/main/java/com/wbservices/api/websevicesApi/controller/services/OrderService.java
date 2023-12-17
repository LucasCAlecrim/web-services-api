package com.wbservices.api.websevicesApi.controller.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wbservices.api.websevicesApi.model.Order;
import com.wbservices.api.websevicesApi.repository.OrderRepository;

@Service
public class OrderService {

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

    @Autowired
    private OrderRepository repository;
}
