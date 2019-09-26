package com.springboot.timemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.timemanagement.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
