package com.codegym.ao9.controller;

import com.codegym.ao9.model.Mycounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("mycounter")
public class CounterControllers {
    @ModelAttribute("mycounter")
    public Mycounter setUpCounter() {
        return new Mycounter();
    }
    @GetMapping("/")
    public  String getCount(@ModelAttribute("mycounter") Mycounter mycounter){
        mycounter.increment();
        return  "index";
    }
}
