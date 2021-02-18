package com.example.demo.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<EnhanceCustomer, Long>{

	//public List<Customer> findByZip(String zip);
}
