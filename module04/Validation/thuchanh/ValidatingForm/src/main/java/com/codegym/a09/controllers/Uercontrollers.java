package com.codegym.a09.controllers;

import com.codegym.a09.model.User;

import com.codegym.a09.service.lmlp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class Uercontrollers {
    @Autowired
    UserService userService;

    @Controller
    public class UserController {
        @GetMapping("/")
        public ModelAndView showForm() {
            ModelAndView modelAndView = new ModelAndView("index");
            modelAndView.addObject("user", new User());
            return modelAndView;
        }

        @PostMapping("/validate")
        public ModelAndView checkValidation(@Validated @ModelAttribute("user") User user, BindingResult bindingResult) {
            if (bindingResult.hasFieldErrors()) {
                ModelAndView modelAndView = new ModelAndView("index");
                return modelAndView;
            } else {
                return new ModelAndView("result", "user", userService.saveUser(user));
            }

        }
    }
}
