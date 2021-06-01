package com.codegym.a09.repository;

import com.codegym.a09.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface IProductRepository extends JpaRepository<Product ,Integer> {
    Page<Product> findByNameContaining(String name, Pageable pageable);
}
