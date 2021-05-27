package com.dem0.demo.controllers;

import com.dem0.demo.model.Customers;
import com.dem0.demo.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.criteria.CriteriaBuilder;

@Controller

public class CustomerControllers {

    @Autowired
    CustomersService customersService;

    @GetMapping("/home")
    public ModelAndView getCustomers() {
        return new ModelAndView("index", "customers", customersService.findAllCustomer());
    }

    @GetMapping("/delete/{id}")
    public ModelAndView customerDelete(@PathVariable Integer id) {
        customersService.delete(id);
        return new ModelAndView("index  ", "customers", customersService.findAllCustomer());
    }

    @GetMapping("/create")
    public ModelAndView getCustomersForm() {
        return new ModelAndView("create", "customers", new Customers());
    }

    @PostMapping("/create")
    public String saveCustomer(@ModelAttribute("customers") Customers customers) {
        customersService.saveCustomer(customers);
        return "redirect:/home";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("customers",customersService.findById(id));
        return "/edit";
    }
    @PostMapping("/edit")
    public String update(Customers customers) {
       customersService.updateCustomer(customers);
        return "redirect:/home";
    }

}