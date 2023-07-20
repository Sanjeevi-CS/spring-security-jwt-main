package com.iamneo.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iamneo.security.entity.Order;
import com.iamneo.security.entity.Product;
import com.iamneo.security.service.OrderService;

@Controller
@RequestMapping("/api/v1/auth")
@CrossOrigin("https://localhost:3000")
public class OrderController {
    @Autowired
    OrderService serv;

    // TODO : Implement order related APIs
    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllProducts() {
        List<Order> products = serv.getDetails();
        // products from MySQL
        return ResponseEntity.ok(products);
    }

    @PostMapping("/orders")
    public ResponseEntity<Order> addProduct(@RequestBody Order product) {
        Order savedProduct = serv.savesProduct(product);
        return ResponseEntity.ok(savedProduct);
    }

    // @DeleteMapping("/products/{id}")
    // public String del(@PathVariable("id") int id) {
    // serv.delete(id);
    // return "Deleted SuccessFully";
    // }
    @DeleteMapping("/orders/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") int id) {
        serv.delete(id);
        return ResponseEntity.ok("Product Deleted Successfully");
    }

}
