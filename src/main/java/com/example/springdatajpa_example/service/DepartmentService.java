package com.example.springdatajpa_example.service;


import com.example.springdatajpa_example.entity.Department;
import com.example.springdatajpa_example.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository repository;
    public List<Department> GetALlDepartment(){
        return repository.findAll();
    }
    public Department GetByID(String IDPB)
    {
        return repository.getById(IDPB);
    }
    public void EditDepartment(Department d){
        repository.save(d);
    }
    public void AddDepartment(Department d){
        repository.save(d);
    }
    public void RemoveDepartment(Department d){repository.delete(d);}
}
