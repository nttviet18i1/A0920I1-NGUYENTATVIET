package com.shopping.demo.controllers;


import com.shopping.demo.model.Cart;
import com.shopping.demo.model.Product;
import com.shopping.demo.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping ( "product" )
@SessionAttributes ( "carts" )
public class ProductControllers {
    @Autowired
    private ProductService productService;

    @ModelAttribute ( "carts" )
    public HashMap <Long, Cart> getShowInfo() {
        return new HashMap <>();
    }

    @GetMapping ( "/list" )
    public String showProduct(Model model) {
        List <Product> products = productService.getAll();
        model.addAttribute("products" , products);
        return "list";
    }

    @GetMapping ( "/add" )
    public String addProduct(Model model) {
        model.addAttribute("products" , new Product());
        return "create";
    }

    @PostMapping ( "/add" )
    public String saveCreate(@ModelAttribute Product product , RedirectAttributes redirectAttributes) {
        productService.save(product);
        redirectAttributes.addFlashAttribute("message" , "New product successfuly !");
        return "redirect:/product/list";

    }

    @GetMapping ( "/delete-product/{id}" )
    public String showDeleteProduct(@PathVariable Long id , Model model) {
        Product product = productService.getById(id);

        model.addAttribute("products" , product);
        return "delete";
    }

    @PostMapping ( "/delete-product/{id}" )
    public String deleteProduct(@ModelAttribute Product product , @PathVariable Long id) {
        productService.delete(id);
        return "redirect:/product/list";
    }

    @GetMapping ( "/view-product/{id}" )
    public String viewProduct(@PathVariable Long id , Model model , @ModelAttribute ( "carts" ) HashMap <Long, Cart> cartHashMap) {
        Product product = productService.getById(id);
        model.addAttribute("carts" , cartHashMap);
        model.addAttribute("product" , product);
        return "view";
    }

}
