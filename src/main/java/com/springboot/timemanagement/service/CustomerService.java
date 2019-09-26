package com.springboot.timemanagement.service;

import java.util.ArrayList;
import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.timemanagement.dao.CustomerRepository;
import com.springboot.timemanagement.model.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}
	
	public Customer getCustomer(Integer id) {
		return customerRepository.getOne(id);
	}
	
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	public void updateCustomer(Integer id, Customer customer) {
		customerRepository.save(customer);
	}
	
	public void deleteCustomer(Integer id) {
		customerRepository.deleteById(id);
	}
}
