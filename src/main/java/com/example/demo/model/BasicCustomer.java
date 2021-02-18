package com.example.demo.model;

import javax.persistence.Id;

public class BasicCustomer {
	
	String name;
	String address;
	String dept;
	String zip;
	int yearOfJoining;
	java.util.List<String> skillList;
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
	public java.util.List<String> getSkillList() {
		return skillList;
	}
	public void setSkillList(java.util.List<String> skillList) {
		this.skillList = skillList;
	}
	@Override
	public String toString() {
		return "BasicCustomer [name=" + name + ", address=" + address + ", dept=" + dept + ", zip=" + zip
				+ ", yearOfJoining=" + yearOfJoining + ", skillList=" + skillList + "]";
	}

}
