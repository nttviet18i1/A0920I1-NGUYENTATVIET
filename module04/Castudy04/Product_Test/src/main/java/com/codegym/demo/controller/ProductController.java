package com.codegym.demo.controller;

import com.codegym.demo.model.Product;
import com.codegym.demo.service.CategoryService;
import com.codegym.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;
    @GetMapping("/")

    public ModelAndView listProduct(@RequestParam Optional <String> key_word, @PageableDefault(value = 3) Pageable pageable, Model model){
        if(!key_word.isPresent()){
            return new ModelAndView("index","products",productService.findAll(pageable));
        }
        else {
            model.addAttribute("key_word" ,key_word.get());
            return new ModelAndView("index","products",productService.searchName(key_word.get(),pageable));
        }
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("products",categoryService.findAllCategory());
      model.addAttribute("products",productService.findByid(id));
        return "/edit";
    }
    @PostMapping("/edit")
    public String update(Product product) {
        productService.update(product);
        return "redirect:/";
    }

    @GetMapping("delete/{id}")
    public String deleteProduct(@PathVariable  int id){
        productService.delete(id);
        return "redirect:/";

    }
}
