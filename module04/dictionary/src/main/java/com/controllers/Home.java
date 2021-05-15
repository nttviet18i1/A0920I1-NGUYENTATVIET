package com.controllers;


import com.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Home {

    @ Autowired
    IDictionaryService iDictionnaryService;
    @GetMapping("/home")
    public ModelAndView Home() {
        return new ModelAndView("home");
    }

    @PostMapping("/home")
    public ModelAndView getCurrency(@RequestParam(value="eng", required=true) String eng) {
        return new ModelAndView("home", "vn", iDictionnaryService.toVn(eng));
    }
}

