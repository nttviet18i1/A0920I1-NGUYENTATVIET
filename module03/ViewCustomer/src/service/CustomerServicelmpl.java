package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServicelmpl implements CustomerService {
    private static Map<String, Customer>customerMap;
public CustomerServicelmpl(){
if(customerMap!=null){
    return;
}
        customerMap = new HashMap<>();
        customerMap.put(1, new Customer(1,"nguyen van a", "nguyenvana@gmail.com","HN"));


    }

    @Override
    public Customer getCustomerbyID(String id) {
        return customerMap.get(id);
    }

    @Override
    public List<Customer> getAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void SaveCustomer(Customer customer) {
    customerMap.put(String.valueOf(customer.getId()),customer); }

    @Override
    public void DeleteCustomer(Customer customer) {

    }
}
