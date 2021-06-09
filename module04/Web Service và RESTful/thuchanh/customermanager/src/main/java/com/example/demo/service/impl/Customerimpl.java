package com.example.demo.service.impl;

import com.example.demo.model.Customers;
import com.example.demo.reponsitory.CustomerRepository;
import com.example.demo.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Customerimpl implements CustomersService {
    @Autowired
    CustomerRepository customerRepository;


    @Override
    public List<Customers> findAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public void delete(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void saveCustomer(Customers customers) {
        customerRepository.save(customers);
    }

    @Override
    public void updateCustomer(Customers customers) {
        customerRepository.save(customers);
    }

    @Override
    public Customers findById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customers> findName(String name) {
      return   customerRepository.findCustomersByName(name);
    }


}
