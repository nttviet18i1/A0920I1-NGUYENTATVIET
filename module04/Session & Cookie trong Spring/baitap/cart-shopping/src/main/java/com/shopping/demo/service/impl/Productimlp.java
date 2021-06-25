package com.shopping.demo.service.impl;

import com.shopping.demo.model.Product;
import com.shopping.demo.repository.ProductReponsitory;
import com.shopping.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Productimlp implements ProductService {
    @Autowired
    ProductReponsitory productReponsitory;
    @Override
    public List<Product> getAll() {return productReponsitory.findAll();}

    @Override
    public void save(Product product) { productReponsitory.save(product);}

    @Override
    public void delete(Long id) { productReponsitory.deleteById(id);}

    @Override
    public Product getById(Long id) {
        return productReponsitory.getById(id);
    }
}
