package com.example.springdatajpa_example.controller;

import com.example.springdatajpa_example.entity.User;
import com.example.springdatajpa_example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    LoginService service;

    @PostMapping("login")
    public String index(@ModelAttribute User u,Model model){
        User user = service.IsExistUser(u.getUsername(),u.getPassword());
        if (user!=null){
            model.addAttribute("message","Welcome," + user.getUsername());
            return "Welcome";
        }
        else {
            model.addAttribute("message","Invalid user or password!!");
            model.addAttribute("user",new User());
            return "login/Login";
        }
    }
}
