package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EnterpriseCustomer")

public class EnhanceCustomer {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	
	String designation;
	String skillType;
	String name;
	String address;
	String dept;
	String zip;
	int yearOfJoining;
	//java.util.List<String> skillList;
	@Id
	long id;
	

	@Override
	public String toString() {
		return "EnhanceCustomer [designation=" + designation + ", skillType=" + skillType + ", id=" + id + "]";
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSkillType() {
		return skillType;
	}
	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

} 
