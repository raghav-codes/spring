package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BasicCustomer;
import com.example.demo.model.Customer;
import com.example.demo.model.EnhanceCustomer;
import com.example.demo.service.CustomerServiceIntf;

@RestController
public class SpringCrudH2Controller {

	
	@Autowired
	CustomerServiceIntf customerservice;
	
	@PostMapping("/customer")
	private EnhanceCustomer CreateCustomer(@RequestBody BasicCustomer c) {
		
	System.out.println(c.toString());		
	return customerservice.createCustomer(c);
	
		
	}
	
	@GetMapping("/customer")
	private EnhanceCustomer getCustomer(@RequestParam("id") long id) {
			return customerservice.getCustomerDetails(id);
	}
	
	@DeleteMapping("/customer")
	private void deleteCustomer(@RequestParam("id") long id) {
		
		customerservice.deleteCustomerDetails(id);
	}
		
	@PutMapping("/customer")
	private EnhanceCustomer updateCustomer(@RequestBody BasicCustomer c,@RequestParam("id") long id) {
	
			
			return customerservice.updateCustomer(c,id);
		}
	@GetMapping("/customer/zip")
	private List<Customer> getCustomer(@RequestParam("zip") String zip) {
			return null;
	}
			
	
	
	}
	
	

