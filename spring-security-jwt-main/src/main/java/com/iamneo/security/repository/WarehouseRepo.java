package com.iamneo.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iamneo.security.entity.Warehouse;

@Repository
public interface WarehouseRepo extends JpaRepository<Warehouse, Integer> {

}
