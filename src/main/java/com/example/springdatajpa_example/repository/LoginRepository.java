package com.example.springdatajpa_example.repository;

import com.example.springdatajpa_example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<User,String> {
    User findByUsernameAndAndPassword(String username,String password);
}
