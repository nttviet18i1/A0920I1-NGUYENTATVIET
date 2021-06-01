package com.codegym.a09.service.lmpl;

import com.codegym.a09.model.Product;
import com.codegym.a09.repository.IProductRepository;
import com.codegym.a09.service.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProduct {
    @Autowired
    IProductRepository iProductRepository;
    @Override
    public Page<Product> findAll(Pageable pageable) {
        return iProductRepository.findAll(pageable);
    }

    @Override
    public Product findByid(int id) {
        return iProductRepository.findById(id).orElse(null);

    }

    @Override
    public void delete(int id) {
        iProductRepository.deleteById(id);

    }

    @Override
    public void create(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void update(Product product) {
        iProductRepository.save(product);

    }

    @Override
    public Page<Product> searchName(String name,Pageable pageable) {
        return iProductRepository.findByNameContaining(name, pageable);
    }
}
