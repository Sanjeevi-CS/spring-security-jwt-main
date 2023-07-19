package com.iamneo.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamneo.security.entity.Product;
import com.iamneo.security.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

    public Product savesProduct(Product p) {
        return repo.save(p);
    }

    public List<Product> getDetails() {
        List<Product> arr = new ArrayList<>();
        arr = (List<Product>) repo.findAll();
        return arr;
    }

}
