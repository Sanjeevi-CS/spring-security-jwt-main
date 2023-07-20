package com.iamneo.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamneo.security.entity.Product;
import com.iamneo.security.entity.Warehouse;
import com.iamneo.security.repository.WarehouseRepo;

@Service
public class WarehouseService {
    @Autowired
    WarehouseRepo repo;

    public Warehouse savesProduct(Warehouse p) {
        return repo.save(p);
    }

    public List<Warehouse> getDetails() {
        List<Warehouse> arr = new ArrayList<>();
        arr = (List<Warehouse>) repo.findAll();
        return arr;
    }

    public void delete(int id) {
        repo.deleteById(id);
    }

}
