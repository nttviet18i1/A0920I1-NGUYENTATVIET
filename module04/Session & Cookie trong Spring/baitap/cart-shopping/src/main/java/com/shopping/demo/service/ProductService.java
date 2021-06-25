package com.shopping.demo.service;

import com.shopping.demo.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
     void save(Product product);
     void  delete(Long id);
     Product getById(Long id);

}
