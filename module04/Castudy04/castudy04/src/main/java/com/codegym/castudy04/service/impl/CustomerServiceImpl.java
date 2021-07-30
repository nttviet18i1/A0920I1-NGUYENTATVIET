package com.codegym.castudy04.service.impl;

import com.codegym.castudy04.model.Customer;
import com.codegym.castudy04.repository.CustomerReponsitory;
import com.codegym.castudy04.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerReponsitory customerReponsitory;

    @Override
    public Optional <Customer> findById(Integer id) {
        return customerReponsitory.findById(id);
    }

    @Override
    public Page <Customer> findAll(Pageable pageable) {
        return customerReponsitory.findAll(pageable);
    }

    @Override
    public Customer create(Customer customer) {
        return customerReponsitory.save(customer);
    }

    @Override
    public void update(Customer customer) {
        customerReponsitory.save(customer);

    }

    @Override
    public void delete(Integer id) {
        customerReponsitory.deleteById(id);
}

    @Override
    public Page <Customer> searchName(String customerName , Pageable pageable) {
        return customerReponsitory.findByNameContaining(customerName,pageable);
    }
}
