package com.repository;

import com.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer>findAll();
     void getCustomerId();
    void deleteCustomerById(String id);
    void createCustomer(Customer customer);
    void updateCustomer(Customer customer);
}
