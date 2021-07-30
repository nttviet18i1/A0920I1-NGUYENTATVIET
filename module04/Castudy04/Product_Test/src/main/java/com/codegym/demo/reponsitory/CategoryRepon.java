package com.codegym.demo.reponsitory;

import com.codegym.demo.model.Category;
import com.codegym.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Locale;

@Repository
public interface CategoryRepon extends JpaRepository<Category,Integer> {


}
