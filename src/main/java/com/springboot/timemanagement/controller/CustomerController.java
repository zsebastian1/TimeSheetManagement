package com.springboot.timemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.timemanagement.model.Customer;
import com.springboot.timemanagement.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@RequestMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable Integer id) {
		return customerService.getCustomer(id);
	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	
	@RequestMapping(value = "/customers/{id}", method = RequestMethod.PUT)
	public void updateCustomer( @PathVariable Integer id, @RequestBody Customer customer) {
		customerService.updateCustomer(id, customer);
	}
	
	@RequestMapping(value = "/customers/{id}", method = RequestMethod.DELETE)
	public void deleteCustomer( @PathVariable Integer id) {
		customerService.deleteCustomer(id);
	}
	
}
