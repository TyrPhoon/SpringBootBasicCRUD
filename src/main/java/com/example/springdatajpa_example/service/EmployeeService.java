package com.example.springdatajpa_example.service;

import com.example.springdatajpa_example.entity.Employee;
import com.example.springdatajpa_example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;
    public List<Employee> SearchEmployeebyIDNV(String IDNV){
        return repository.findAllById(IDNV);
    }
    public List<Employee> SearchEmployeebyIDPB(String IDPB){
        return repository.findAllByIDPB(IDPB);
    }
    public List<Employee> SearchEmployeebyName(String name){
        return repository.findAllByNameLike(name);
    }
    public List<Employee> SearchEmployeebyAddress(String add){
        return repository.findAllByAddressLike(add);
    }
    public Employee GetEmployeeByIDNV(String IDNV){
        return repository.findByIdIs(IDNV);
    }
    public List<Employee> GetAll(){return repository.GetALL();};
    public void DeleteEmployee(Employee e){
        repository.delete(e);
    }
    public void SaveEmployee(Employee e){
        repository.save(e);
    }

}
