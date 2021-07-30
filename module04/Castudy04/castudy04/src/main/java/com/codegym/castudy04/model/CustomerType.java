package com.codegym.castudy04.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class CustomerType {
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Id
    private  int customerTypeId;
    private  String customerTypeName;
    @OneToMany(mappedBy = "customerType")
    private  List<Customer> customers;

    public CustomerType() {
    }

    public CustomerType(int customerTypeId , String customerTypeName , List <Customer> customers) {
        this.customerTypeId = customerTypeId;
        this.customerTypeName = customerTypeName;
        this.customers = customers;
    }

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public List <Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List <Customer> customers) {
        this.customers = customers;
    }
}