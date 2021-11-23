package com.example.springdatajpa_example.service;

import com.example.springdatajpa_example.entity.User;
import com.example.springdatajpa_example.repository.LoginRepository;

public class LoginService {
    LoginRepository repository;
    public User IsExistUser(String username,String password){
        return repository.findByUsernameAndAndPassword(username,password);
    }
}
