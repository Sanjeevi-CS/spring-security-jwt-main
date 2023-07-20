package com.iamneo.security.entity;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private Date date;
    private int quantity;
    private int price;
    private int total;
    private String status;
    private String customername;
    private Long customerph;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Product> products;

    // Getter and setter for products
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public Long getCustomerph() {
        return customerph;
    }

    public void setCustomerph(Long customerph) {
        this.customerph = customerph;
    }

    public Order(int id, Date date, int quantity, int price, int total, String status, String customername,
            Long customerph) {
        this.id = id;
        this.date = date;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.status = status;
        this.customername = customername;
        this.customerph = customerph;
    }

    public Order() {

    }

}
