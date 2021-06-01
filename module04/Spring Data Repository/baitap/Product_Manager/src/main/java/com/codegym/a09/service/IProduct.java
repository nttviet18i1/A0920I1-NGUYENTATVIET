package com.codegym.a09.service;

import com.codegym.a09.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProduct {
    Page<Product>findAll(Pageable pageable);
    Product findByid(int id);
    void delete(int id);
    void create(Product product);
    void update(Product product);
    Page<Product>searchName(String name,Pageable pageable);

}
