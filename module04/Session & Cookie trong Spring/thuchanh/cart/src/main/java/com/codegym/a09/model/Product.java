package com.codegym.a09.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Product {
    @Id
    private  String id;
    private  String name;
    private String image;
    private  double price;
    private Date dataCreate;
    private boolean available;
    private  String categoryID;

    public Product() {
    }


    public Product(String id, String name, String image, double price, Date dataCreate, boolean available, String categoryID) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.dataCreate = dataCreate;
        this.available = available;
        this.categoryID = categoryID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDataCreate() {
        return dataCreate;
    }

    public void setDataCreate(Date dataCreate) {
        this.dataCreate = dataCreate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }
}
