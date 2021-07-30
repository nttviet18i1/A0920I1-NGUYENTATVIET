package com.codegym.castudy04.service;

import com.codegym.castudy04.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Optional <Customer> findById(Integer id);

    Page<Customer>findAll(Pageable pageable);

    Customer create(Customer customer);

    void update(Customer customer);

    void delete(Integer id);
    Page <Customer> searchName(String customerName, Pageable pageable);


}
