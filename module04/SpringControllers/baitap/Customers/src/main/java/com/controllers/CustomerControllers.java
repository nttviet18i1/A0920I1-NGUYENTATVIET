package com.controllers;

import com.model.Customer;
import com.service.CustomerServicelpml;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerControllers {


    @RequestMapping("/home")
    public String   getList(Model model){
        CustomerServicelpml customerServicelpml = new CustomerServicelpml();
        model.addAttribute("customers",customerServicelpml.findAll());
        return"list";

    }
    CustomerServicelpml customerServicelpml = new CustomerServicelpml();
   @GetMapping("/delete/{id}")
    public ModelAndView deleteCustomer(@PathVariable String id){
       customerServicelpml.deleteCustomerById(id);
        ModelAndView modelAndView = new ModelAndView("list");
           modelAndView.addObject("customers",customerServicelpml.findAll());
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView viewCreateCustomerform(){
        return new ModelAndView("addcustomer");
    }

    @PostMapping( "/create")
    public ModelAndView CreateNewCustomer(@RequestParam String id, @RequestParam String name, @RequestParam int age ,@RequestParam String address){
        ModelAndView modelAndView = new ModelAndView("/list");
        CustomerServicelpml customerServicelpml = new CustomerServicelpml();
        customerServicelpml.createCustomer(new Customer(id,name,age,address));
        modelAndView.addObject("customers",customerServicelpml.findAll());
        return modelAndView;
    }
}
