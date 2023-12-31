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
import org.springframework.web.bind.annotation.RequestParam;

import com.iamneo.security.entity.Product;
import com.iamneo.security.service.ProductService;

@RequestMapping("/api/v1/auth")
@CrossOrigin("https://localhost:3000")
@Controller
public class ProductController {
    @Autowired
    private ProductService serv;

    // @PostMapping("/add")
    // public Product saveP(@RequestBody Product product) {
    // serv.savesProduct(product);
    // return product;
    // }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = serv.getDetails();
        // products from MySQL
        return ResponseEntity.ok(products);
    }

    @PostMapping("/products")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product savedProduct = serv.savesProduct(product);
        return ResponseEntity.ok(savedProduct);
    }

    // @DeleteMapping("/products/{id}")
    // public String del(@PathVariable("id") int id) {
    // serv.delete(id);
    // return "Deleted SuccessFully";
    // }
    @DeleteMapping("/products/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") int id) {
        serv.delete(id);
        return ResponseEntity.ok("Product Deleted Successfully");
    }

}
