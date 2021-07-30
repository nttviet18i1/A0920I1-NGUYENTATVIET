package com.codegym.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Product {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id ;

    String name;

    double price;

    String status;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    Category categoryId;

    public Product() {
    }

    public Product(int id , String name , double price , String status , Category categoryId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
        this.categoryId = categoryId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }
}
