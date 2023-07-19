package com.iamneo.security.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
    @Id
    private int id;
    private String name;
    private String d;
    private int SKU;
    private int price;
    private int quantity;
    private String image;

    @ManyToOne
    @JoinColumn(name = "supid")
    @Cascade(CascadeType.ALL)
    private Supplier supplier;

    public Product() {
    }

    public Product(int id, String name, String d, int SKU, int price, int quantity, String image) {
        this.id = id;
        this.name = name;
        this.d = d;
        this.SKU = SKU;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
        // this.supid = supid;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getD() {
        return d;
    }

    public int getSKU() {
        return SKU;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getImage() {
        return image;
    }

    // public int getSupid() {
    // return supid;
    // }

    public Supplier getSupplier() {
        return supplier;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setD(String d) {
        this.d = d;
    }

    public void setSKU(int SKU) {
        this.SKU = SKU;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
