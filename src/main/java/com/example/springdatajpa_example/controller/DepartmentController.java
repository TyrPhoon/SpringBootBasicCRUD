package com.example.springdatajpa_example.controller;

import com.example.springdatajpa_example.entity.Department;
import com.example.springdatajpa_example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
    @GetMapping("/create-department")
    public String Showformcreate(Model  model){
        model.addAttribute("department", new Department());
        return "department/FormCreate";
    }
    @PostMapping("/create-department")
    public String AddDP(@ModelAttribute Department department,Model model){
        service.AddDepartment(department);
        model.addAttribute("department", new Department());
        model.addAttribute("message","Created successfully");
        return "department/FormCreate";
    }
    @GetMapping("/edit-department/{id}")
    public String Showformedit(@PathVariable String id, Model  model){
        Department d = service.GetByID(id);
        model.addAttribute("department", d);
        return "department/FormEdit";
    }
    @PostMapping("/edit-department")
    public String EditDP(@ModelAttribute Department department,Model model){
        service.EditDepartment(department);
        Department d = service.GetByID(department.getId());
        model.addAttribute("department", d);
        model.addAttribute("message","Edited successfully");
        return "department/FormEdit";
    }
    @GetMapping("/delete-department/{id}")
    public String Showformdelete(@PathVariable String id,Model  model){
        Department d = service.GetByID(id);
        model.addAttribute("department", d);
        return "department/FormDelete";
    }
    @PostMapping("/delete-department")
    public String DeleteDP(@ModelAttribute Department department,Model model){
        service.RemoveDepartment(department);
        return "redirect:/alldp";
    }
}
