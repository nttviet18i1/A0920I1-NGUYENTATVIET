package com.codegym.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    String name;
    @OneToMany(mappedBy = "categoryId")
    private List<Product> products;

    public Category() {
    }

    public Category(int id , String name , List <Product> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List <Product> getProducts() {
        return products;
    }

    public void setProducts(List <Product> products) {
        this.products = products;
    }
}
