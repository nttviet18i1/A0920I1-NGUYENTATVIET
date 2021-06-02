package com.example.demo.controllers;

import com.example.demo.model.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class UserControllers {
    @Autowired
    IUserService userService;
    @GetMapping("/")

    public ModelAndView getForm() {
        return new ModelAndView("index", "user", new User());
    }

    @PostMapping("/")
    public ModelAndView getValidate(@Valid @ModelAttribute User user , BindingResult bindingResult) {

        if(bindingResult.hasErrors())
        {
            return  new ModelAndView("index","user",user);
        }
        else {
            userService.saveUser(user);

             return  new ModelAndView("result" ,"user",user);
        }

    }
}
