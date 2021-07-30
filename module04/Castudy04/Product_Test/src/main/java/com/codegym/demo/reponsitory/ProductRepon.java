package com.codegym.demo.reponsitory;

import com.codegym.demo.model.Product;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepon extends JpaRepository<Product,Integer> {

    Page <Product> findByNameContaining(String name, Pageable pageable);
}
