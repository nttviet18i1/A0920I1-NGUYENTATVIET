package com.codegym.castudy04.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import java.util.Date;
@Entity

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

  private   int customerId;

    private String customerName ;

    private Date customerBirthday ;

    private String customerGender;

    private String customerIdCard ;

    private String customerPhone ;

    private String customerEmail ;

    private String customerAddress ;
    @ManyToOne
    @JoinColumn(name = "customerTypeId")
    private CustomerType customerType;

  public Customer() {
  }

  public Customer(int customerId , String customerName , Date customerBirthday , String customerGender , String customerIdCard , String customerPhone , String customerEmail , String customerAddress , CustomerType customerType) {
    this.customerId = customerId;
    this.customerName = customerName;
    this.customerBirthday = customerBirthday;
    this.customerGender = customerGender;
    this.customerIdCard = customerIdCard;
    this.customerPhone = customerPhone;
    this.customerEmail = customerEmail;
    this.customerAddress = customerAddress;
    this.customerType = customerType;
  }

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public Date getCustomerBirthday() {
    return customerBirthday;
  }

  public void setCustomerBirthday(Date customerBirthday) {
    this.customerBirthday = customerBirthday;
  }

  public String getCustomerGender() {
    return customerGender;
  }

  public void setCustomerGender(String customerGender) {
    this.customerGender = customerGender;
  }

  public String getCustomerIdCard() {
    return customerIdCard;
  }

  public void setCustomerIdCard(String customerIdCard) {
    this.customerIdCard = customerIdCard;
  }

  public String getCustomerPhone() {
    return customerPhone;
  }

  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public String getCustomerAddress() {
    return customerAddress;
  }

  public void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
  }

  public CustomerType getCustomerType() {
    return customerType;
  }

  public void setCustomerType(CustomerType customerType) {
    this.customerType = customerType;
  }
}
