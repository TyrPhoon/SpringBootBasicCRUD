package com.example.springdatajpa_example.controller;

import com.example.springdatajpa_example.entity.Department;
import com.example.springdatajpa_example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DepartmentController {
    @Autowired
    DepartmentService service;

    @GetMapping("/alldp")
    public String ViewAllDP(Model model){
        List<Department> departments = service.GetALlDepartment();
        model.addAttribute("departments",departments);
        return "/department/ViewAll";
    }
}
