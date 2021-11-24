package com.example.springdatajpa_example.controller;

import com.example.springdatajpa_example.entity.Department;
import com.example.springdatajpa_example.entity.Employee;
import com.example.springdatajpa_example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService service;
    @GetMapping("/allem")
    public String ViewAllDP(Model model){
        List<Employee> employees = service.GetAll();
        model.addAttribute("employees",employees);
        return "/employee/ViewAll";
    }
    @GetMapping("/create-employee")
    public String Showformcreate(Model  model){
        model.addAttribute("employees", new Employee());
        return "employee/FormCreate";
    }
    @PostMapping("/create-employee")
    public String AddDP(@ModelAttribute Employee employee, Model model){
        service.SaveEmployee(employee);
        model.addAttribute("employees", new Employee());
        model.addAttribute("message","Created successfully");
        return "employee/FormCreate";
    }
    @GetMapping("/edit-department/{id}")
    public String Showformedit(@PathVariable String id, Model  model){
        Employee e = service.GetEmployeeByIDNV(id);
        model.addAttribute("employees", e);
        return "employee/FormEdit";
    }
    @PostMapping("/edit-employee")
    public String EditDP(@ModelAttribute Employee employee,Model model){
        service.SaveEmployee(employee);
        Employee e = service.GetEmployeeByIDNV(employee.getId());
        model.addAttribute("employees", e);
        model.addAttribute("message","Edited successfully");
        return "employee/FormEdit";
    }
    @GetMapping("/delete-department/{id}")
    public String Showformdelete(@PathVariable String id,Model  model){
        Employee employee = service.GetEmployeeByIDNV(id);
        model.addAttribute("employees", employee);
        return "employee/FormDelete";
    }
    @PostMapping("/delete-department")
    public String DeleteDP(@ModelAttribute Employee employee,Model model){
        service.DeleteEmployee(employee);
        return "redirect:/allem";
    }

}
