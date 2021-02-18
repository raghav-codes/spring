
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BasicCustomer;
import com.example.demo.model.CustomerRepository;
import com.example.demo.model.EnhanceCustomer;

@Service
public class CustomerService implements CustomerServiceIntf {

	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	CustomerEnrichedService customerEnrichedService;

	@Override
	public EnhanceCustomer createCustomer(BasicCustomer c) {
		return customerRepository.save(customerEnrichedService.enrichedCustomer(c));
		 

	}

	@Override
	public EnhanceCustomer getCustomerDetails(long id) {
		return customerRepository.findById(id).get();
		
		//return null;

	}

	@Override
	public void deleteCustomerDetails(long id) { 
		customerRepository.deleteById(id);;
  
  }

	@Override
	public EnhanceCustomer updateCustomer(BasicCustomer c, long id) { 
		EnhanceCustomer updatedEnrichementCustomer = customerEnrichedService.enrichedCustomer(c);
		
		//Existing attribute from DB
		//System.out.println("ID    "+id);
		EnhanceCustomer existingDBCustomer = customerRepository.findById(id).get();
		org.springframework.beans.BeanUtils.copyProperties(updatedEnrichementCustomer, existingDBCustomer);
		existingDBCustomer.setId(id);
		
		return customerRepository.save(existingDBCustomer);
		
		//return null;
  }

	
	

}
