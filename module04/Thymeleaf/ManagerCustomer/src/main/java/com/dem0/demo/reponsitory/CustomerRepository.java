package com.dem0.demo.reponsitory;

import com.dem0.demo.model.Customers;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.hibernate.secure.internal.JaccSecurityListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer> {
  List<Customers>findCustomersByName(String name);


}
