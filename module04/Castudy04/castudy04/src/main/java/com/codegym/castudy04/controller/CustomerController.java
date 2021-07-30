package com.codegym.castudy04.controller;

import com.codegym.castudy04.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping( "/" )
    public ModelAndView listProduct(@RequestParam Optional <String> key_word , @PageableDefault( value = 3 ) Pageable pageable , Model model) {
        if (!key_word.isPresent()) {
            return new ModelAndView("list-customer" , "customers" , customerService.findAll(pageable));
        } else {
            model.addAttribute("key_word" , key_word.get());
            return new ModelAndView("list-customer" , "customers" , customerService.searchName(key_word.get() , pageable));
        }
    }
}

