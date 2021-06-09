package com.codegym.a09.service;

import com.codegym.a09.model.Product;
import com.codegym.a09.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService  implements IProductService{
    @Autowired
    ProductRepository productRepository;


      @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
