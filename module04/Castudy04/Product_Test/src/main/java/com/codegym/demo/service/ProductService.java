package com.codegym.demo.service;

import com.codegym.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    Page <Product> findAll(Pageable pageable);
    Product findByid(int id);
    void update(Product product);
    Page<Product>searchName(String name,Pageable pageable);
    void delete(int id);
}
