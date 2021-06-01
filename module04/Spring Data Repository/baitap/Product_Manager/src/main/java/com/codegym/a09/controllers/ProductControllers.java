package com.codegym.a09.controllers;

import com.codegym.a09.model.Product;
import com.codegym.a09.service.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller

public class ProductControllers {
   @Autowired
    IProduct iProduct;
   @GetMapping("/")
  public ModelAndView listProduct(@RequestParam Optional<String> key_word, @PageableDefault(value = 3)Pageable pageable, Model model){
      if(!key_word.isPresent()){
          return new ModelAndView("index","products",iProduct.findAll(pageable));
      }
      else {
          model.addAttribute("key_word" ,key_word.get());
      return new ModelAndView("index","products",iProduct.searchName(key_word.get(),pageable));
      }
  }
  @GetMapping("delete/{id}")
    public String deleteProduct(@PathVariable  int id){
       iProduct.delete(id);
       return "redirect:/";

  }
    @GetMapping("/create")
    public ModelAndView getCustomersForm() {
        return new ModelAndView("create", "products", new Product());
    }

    @PostMapping("/create")
    public String saveCustomer(@ModelAttribute("products") Product product) {
    iProduct.create(product);
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("products",iProduct.findByid(id));
        return "/edit";
    }
    @PostMapping("/edit")
    public String update(Product product) {
        iProduct.update(product);
        return "redirect:/";
    }

}
