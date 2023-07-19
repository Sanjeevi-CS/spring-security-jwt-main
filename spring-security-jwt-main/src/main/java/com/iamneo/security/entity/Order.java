package com.iamneo.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    private int id;
    private int userid;
    private int productid;
    private int quantity;
    private int price;
    private String status;

    public Order() {
    }

    public Order(int id, int userid, int productid, int quantity, int price,
            String status) {
        this.id = id;
        this.userid = userid;
        this.productid = productid;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getUserid() {
        return userid;
    }

    public int getProductid() {
        return productid;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }
}
