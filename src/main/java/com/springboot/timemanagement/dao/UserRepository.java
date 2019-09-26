package com.springboot.timemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.timemanagement.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
