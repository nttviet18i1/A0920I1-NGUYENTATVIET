package com.example.demo.reponsitory;
;
import com.example.demo.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer> {
  List<Customers>findCustomersByName(String name);


}
