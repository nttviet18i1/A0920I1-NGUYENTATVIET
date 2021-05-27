package com.example.demo.controllers;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogControllers {
    @Autowired

    BlogRepository blogRepository;
    @GetMapping("/")
    public ModelAndView getIndex(){
        return new ModelAndView("index","blogs", blogRepository.findAll());
    }
    @GetMapping("/edit/{id}")
    public String getEdit(@PathVariable int id, Model model){
        model.addAttribute("blogs",blogRepository.findById(id));
        return "/edit";

    }
    @PostMapping("/edit")
    public String editBlog(Blog blog){
    blogRepository.save(blog);
    return "redirect:/";

    }
    @GetMapping("/delete/{id}")
    public  ModelAndView getDelete(@PathVariable int id){
        blogRepository.deleteById(id);
        return new ModelAndView("Index","blogs",blogRepository.findAll());

    }
    @GetMapping("/create")
    public ModelAndView addBlog(){
        return new ModelAndView("create","blogs",new Blog());

    }
    @PostMapping("/create")
    public  String getAddBlog(@ModelAttribute("blogs") Blog blog){
        blogRepository.save(blog);
        return "redirect:/";


    }
}
