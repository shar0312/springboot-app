package com.example.bitcoin.springbootapp.service;

import com.example.bitcoin.springbootapp.model.User;
import com.example.bitcoin.springbootapp.repository.UserRepository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;
import java.util.List;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;



    public void create(User user){
        userRepository.save(user);

    }

    public List<User> getall(){
        return userRepository.findAll();
    }


}
