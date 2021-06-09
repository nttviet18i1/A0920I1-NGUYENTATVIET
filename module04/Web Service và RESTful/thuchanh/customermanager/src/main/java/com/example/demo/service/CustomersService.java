package com.example.demo.service;


import com.example.demo.model.Customers;

import java.util.List;

public interface CustomersService {
    List<Customers> findAllCustomer();

    void delete(int id);
    void saveCustomer(Customers customers);
    void updateCustomer(Customers customers);

     Customers findById(int id);
     List<Customers>findName(String name);

}

