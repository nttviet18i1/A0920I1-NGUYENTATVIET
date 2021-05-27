package com.dem0.demo.service;

import com.dem0.demo.model.Customers;
import org.springframework.stereotype.Service;

import java.util.List;
public interface CustomersService {
    List<Customers> findAllCustomer();

    void delete(int id);
    void saveCustomer(Customers customers);
    void updateCustomer(Customers customers);

     Customers findById(int id);

}

