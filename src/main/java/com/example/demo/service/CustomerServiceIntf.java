package com.example.demo.service;

import java.util.List;

import com.example.demo.model.BasicCustomer;
import com.example.demo.model.Customer;
import com.example.demo.model.EnhanceCustomer;

public interface CustomerServiceIntf {

	EnhanceCustomer createCustomer(BasicCustomer c);

	EnhanceCustomer getCustomerDetails(long id);

	void deleteCustomerDetails(long id);

	EnhanceCustomer updateCustomer(BasicCustomer c, long id);
	
	//List<Customer> getByZip(String zip);

}