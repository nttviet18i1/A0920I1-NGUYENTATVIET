package com.codegym.demo.service.impl;

import com.codegym.demo.model.Category;
import com.codegym.demo.model.Product;
import com.codegym.demo.reponsitory.CategoryRepon;
import com.codegym.demo.reponsitory.ProductRepon;
import com.codegym.demo.service.CategoryService;
import com.codegym.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

@Autowired
    CategoryRepon categoryRepon;
    @Override
    public List <Category> findAllCategory() {
        return categoryRepon.findAll();
    }
}
