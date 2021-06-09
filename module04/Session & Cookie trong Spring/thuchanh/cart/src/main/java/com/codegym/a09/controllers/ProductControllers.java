package com.codegym.a09.controllers;

import com.codegym.a09.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductControllers {
    @GetMapping("/")
    public  String showProduct( Model model){
        model.addAttribute("product", new Product());
        return "view-product";
    }

}
