package vn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sandwitch {
 @GetMapping("/home")
    public String Display(){
     return"home";
 }
 @PostMapping("/sandwitch")
    public String Result(Model model, @RequestParam(required = false) String condiment){
        model.addAttribute("condiment" ,condiment);
        return "result";
 }

}
