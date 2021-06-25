package com.example.demo.controllers;

import java.util.List;

import com.example.demo.model.Customers;
import com.example.demo.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class CustomerControllers {

    @Autowired
    private CustomersService customersService;

    //-------------------Retrieve All Customers--------------------------------------------------------

    @RequestMapping(value = "/customers/", method = RequestMethod.GET)
    public ResponseEntity<List<Customers>> listAllCustomers() {
        List<Customers> customers = customersService.findAllCustomer();
        if (customers.isEmpty()) {
            return new ResponseEntity<List<Customers>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Customers>>(customers, HttpStatus.OK);
    }

    //-------------------Retrieve Single Customer--------------------------------------------------------

    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customers> getCustomer(@PathVariable("id") long id) {
        System.out.println("Fetching Customer with id " + id);
        Customers customer = customersService.findById((int) id);
        if (customer == null) {
            System.out.println("Customer with id " + id + " not found");
            return new ResponseEntity<Customers>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Customers>(customer, HttpStatus.OK);
    }

    //-------------------Create a Customer--------------------------------------------------------

    @RequestMapping(value = "/customers/", method = RequestMethod.POST)
    public ResponseEntity<Customers> createCustomer(@RequestBody Customers customer) {

        customersService.saveCustomer(customer);
        return new ResponseEntity<Customers>(HttpStatus.CREATED);
    }

    //------------------- Update a Customer --------------------------------------------------------

    @RequestMapping(value = "/customers/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Customers> updateCustomer(@PathVariable("id") int id, @RequestBody Customers customer) {

        customersService.findById(id);
        if (customer == null) {
            return new ResponseEntity<Customers>(HttpStatus.NOT_FOUND);
        } else {
            customersService.saveCustomer(customer);
            customer.setName(customer.getName());
            customer.setAge(customer.getAge());
        }

           /* //------------------- Delete a Customer --------------------------------------------------------
            @RequestMapping(value = "/customers/{id}", method = RequestMethod.DELETE)
            public ResponseEntity<Customers> delete(){


                customersService.findById(id);
                if (customers == null) {

                    return new ResponseEntity<Customers>(HttpStatus.NOT_FOUND);
                } else

                    customersService.delete(id);
                return new ResponseEntity<Customers>(HttpStatus.NO_CONTENT);
            }
        }*/
    }
}

