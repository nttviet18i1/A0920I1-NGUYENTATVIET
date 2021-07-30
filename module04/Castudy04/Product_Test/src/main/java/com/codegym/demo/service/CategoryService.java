package com.codegym.demo.service;

import com.codegym.demo.model.Category;
import com.codegym.demo.model.Product;

import java.util.List;

public interface CategoryService {
    List <Category> findAllCategory();
}
