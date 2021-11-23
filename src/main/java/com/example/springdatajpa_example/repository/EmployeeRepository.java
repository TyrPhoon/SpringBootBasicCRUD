package com.example.springdatajpa_example.repository;

import com.example.springdatajpa_example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String> {
    List<Employee> findAllById(String IDNV);
    List<Employee> findAllByNameLike(String name);
    List<Employee> findAllByIDPB(String IDPB);
    List<Employee> findAllByAddressLike(String address);
    Employee findByIdIs(String IDNV);
    void delete(Employee e);
}
