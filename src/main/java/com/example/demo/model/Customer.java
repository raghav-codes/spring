package com.example.demo.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EnterpriseCustomer")
public class Customer extends EnhanceCustomer{
	
	@Id
	int id;

	
}


