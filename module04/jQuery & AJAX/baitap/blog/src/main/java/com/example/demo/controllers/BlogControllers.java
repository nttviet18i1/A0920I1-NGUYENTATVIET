package com.example.demo.controllers;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;
import com.example.demo.service.IBlog;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("home")
public class BlogControllers {
    @Autowired
    IBlog iBlog;

    @GetMapping("/list")
    public ModelAndView getIndex(@RequestParam Optional<String> key_search, Model model){
        if(!key_search.isPresent())
        {
            return  new ModelAndView("index","blogs" ,iBlog.findAllBlog());
        }else {
            model.addAttribute("key_search",key_search.get());
            return  new ModelAndView("index","blogs" ,iBlog.findByType(key_search.get()));
        }
    }
    @GetMapping("/edit/{id}")
    public String getEdit(@PathVariable int id, Model model){
        model.addAttribute("blogs",iBlog.findById(id));
        return "/edit";

    }
    @PostMapping("/edit")
    public String editBlog(Blog blog){
    iBlog.save(blog);
    return "redirect:/home/list";

    }
    @GetMapping ( "/delete/{id}" )
    public String showDeleteProduct(@PathVariable int id , Model model) {
        Blog blog = iBlog.findById(id);

        model.addAttribute("blogs" , blog);
        return "delete";
    }

    @PostMapping ( "/delete/{id}" )
    public String deleteProduct(@ModelAttribute Blog blog , @PathVariable int id) {
        iBlog.delete(id);
        return "redirect:/home/list";
    }

    @GetMapping("/create")
    public ModelAndView addBlog(){
        return new ModelAndView("create","blogs",new Blog());

    }
    @PostMapping("/create")
    public  String getAddBlog(@Valid @ModelAttribute("blogs") Blog blog, BindingResult bindingResult){
        if(bindingResult.hasErrors())
        {
            return "create";
        }
        else {
            iBlog.save(blog);
            return "redirect:/home/list";
        }

    }
}
