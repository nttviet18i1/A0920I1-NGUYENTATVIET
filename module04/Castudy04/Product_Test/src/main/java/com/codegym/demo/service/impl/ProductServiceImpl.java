package com.codegym.demo.service.impl;

import com.codegym.demo.model.Product;
import com.codegym.demo.reponsitory.ProductRepon;
import com.codegym.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepon productRepon;
    @Override
    public Page <Product> findAll(Pageable pageable) {
        return productRepon.findAll(pageable);
    }

    @Override
    public Product findByid(int id) {
        return productRepon.findById(id).orElse(null);
    }

    @Override
    public void update(Product product) {
        productRepon.save(product);

    }

    @Override
    public Page <Product> searchName(String name , Pageable pageable) {
        return productRepon.findByNameContaining(name,pageable);
    }

    @Override
    public void delete(int id) {
        productRepon.deleteById(id);
    }
}
