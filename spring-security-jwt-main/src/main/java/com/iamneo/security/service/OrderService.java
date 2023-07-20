package com.iamneo.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamneo.security.entity.Order;
import com.iamneo.security.entity.Product;
import com.iamneo.security.repository.OrderRepo;

@Service
public class OrderService {
    @Autowired
    OrderRepo repo;

    public Order savesProduct(Order p) {
        return repo.save(p);
    }

    public List<Order> getDetails() {
        List<Order> arr = new ArrayList<>();
        arr = (List<Order>) repo.findAll();
        return arr;
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}
