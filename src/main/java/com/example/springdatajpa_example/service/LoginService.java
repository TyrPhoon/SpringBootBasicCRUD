package com.example.springdatajpa_example.service;

import com.example.springdatajpa_example.entity.User;
import com.example.springdatajpa_example.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    LoginRepository repository;

    public User IsExistUser(String username,String password){
        try{
            return repository.findByUsernameAndAndPassword(username, password);
        }
        catch (Exception e){
            return null;
        }
    }
    public List<User> GetAll(){
        return repository.findAll();
    }
}
