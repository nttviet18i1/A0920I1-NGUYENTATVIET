package com.codegym.castudy04.repository;

import com.codegym.castudy04.model.Customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerReponsitory extends JpaRepository <Customer ,Integer> {
    Page <Customer> findByNameContaining(String customerName, Pageable pageable);
}
