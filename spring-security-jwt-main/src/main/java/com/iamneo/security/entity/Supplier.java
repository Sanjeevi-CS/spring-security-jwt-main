package com.iamneo.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "supplier")
public class Supplier {
    @Id
    private int supid;
    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "supplier")
    @Cascade(CascadeType.ALL)
    private List<Product> products;

    public Supplier() {
    }

    public Supplier(int supid, String name, String email, String password) {
        this.supid = supid;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getSupid() {
        return supid;
    }

    public void setSupid(int supid) {
        this.supid = supid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
        product.setSupplier(this);
    }
}
