package com.example.springdatajpa_example.repository;

import com.example.springdatajpa_example.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,String> {
   /* List<Department> findAllById();
    void removeById(String id);
    void edit(Department d);*/
}
