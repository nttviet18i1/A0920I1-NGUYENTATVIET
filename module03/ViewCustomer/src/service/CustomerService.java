package service;

import model.Customer;

import java.util.List;

public interface CustomerService {
    Customer getCustomerbyID(String id);
    List<Customer> getAll();
    void SaveCustomer(Customer customer);
    void DeleteCustomer(Customer customer);
}
