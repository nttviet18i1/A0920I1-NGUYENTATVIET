package com.service;

import com.model.Customer;
import com.repository.CustomerRepositorylpml;
import com.repository.ICustomerRepository;

import java.util.List;

public class CustomerServicelpml implements ICustomer {
private ICustomerRepository iCustomerRepository = new CustomerRepositorylpml();

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public void getCustomerId() {

    }

    @Override
    public void deleteCustomerById(String id) {
        iCustomerRepository.deleteCustomerById(id);
    }

    @Override
    public void createCustomer(Customer customer) {
        iCustomerRepository.createCustomer(customer);

    }

    @Override
    public void updateCustomer(Customer customer) {

    }
}
