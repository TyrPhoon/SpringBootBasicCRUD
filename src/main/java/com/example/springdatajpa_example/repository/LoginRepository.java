package com.example.springdatajpa_example.repository;

import com.example.springdatajpa_example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<User,String> {
    @Query("select user from User user where user.username = ?1 and user.password = ?2")
    User findByUsernameAndAndPassword(String username,String password);
}
