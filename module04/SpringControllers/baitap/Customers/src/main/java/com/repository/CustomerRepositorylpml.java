package com.repository;

import com.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepositorylpml implements ICustomerRepository {
    static Map<Integer,Customer>customers= new HashMap<>();
    static {

        customers.put(1,new Customer("1","viet",16,"Quang Nam"));
        customers.put(2,new Customer("2","tu",18,"Quang Binh"));
        customers.put(3,new Customer("3","vy",21,"Quang Tri"));
        customers.put(4,new Customer("4","dung",22,"Quang Ngai"));
        customers.put(5,new Customer("5","dung",29,"Da Nang"));

    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void getCustomerId() {

    }

    @Override
    public void  deleteCustomerById(String id) {
       customers.remove(Integer.parseInt(id));

    }

    @Override
    public void createCustomer(Customer customer) {
        customers.put(Integer.parseInt(customer.getId()),customer);

    }

    @Override
    public void updateCustomer(Customer customer) {

    }
}
