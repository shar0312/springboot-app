package com.example.bitcoin.springbootapp.repository;

import com.example.bitcoin.springbootapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository <User, Long> {

}
