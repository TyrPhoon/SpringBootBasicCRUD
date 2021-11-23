package com.example.springdatajpa_example.controller;

import com.example.springdatajpa_example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("user",new User());
        return "login/Login";
    }
}
