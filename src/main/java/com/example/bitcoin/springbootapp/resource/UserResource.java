package com.example.bitcoin.springbootapp.resource;

import com.example.bitcoin.springbootapp.model.User;
import com.example.bitcoin.springbootapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

    @Autowired
    UserService userService;
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes =MediaType.APPLICATION_JSON_VALUE )
    public List<User> create(@RequestBody final User user){

        userService.create(user);
        return userService.getall();
    }

    @GetMapping
    public List<User> getAll(){
        return userService.getall();
    }
}
