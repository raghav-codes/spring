package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.model.BasicCustomer;
import com.example.demo.model.EnhanceCustomer;

@Service
public class CustomerEnrichedService {
	@Value("${customerportal.designation.qualification.year:10}")
	int designationQualificationYear;

	@Value("${customerportal.niche.skilllist}")
	List<String> nicheSkillList;

	public EnhanceCustomer enrichedCustomer(BasicCustomer c) {
		System.out.println("Controlled passed to custoerenriched service" + c.toString());

		EnhanceCustomer enhanceCustomer = new EnhanceCustomer();
		enhanceCustomer.setName(c.getName());

		// Copying the value from BasicCustomer to EnrichedCustomer
		enhanceCustomer.setAddress(c.getAddress());
		enhanceCustomer.setDept(c.getDept());
		enhanceCustomer.setZip(c.getZip());
		enhanceCustomer.setYearOfJoining(c.getYearOfJoining());
		// enhanceCustomer.setSkillList(c.getSkillList());
		enhanceCustomer.setId(System.currentTimeMillis());

		System.out.println("Controlled passed to custoerenriched service" + enhanceCustomer.toString());

		enhanceCustomer.setDesignation((LocalDate.now().getYear() - c.getYearOfJoining()) >= designationQualificationYear ? "Sr. Associate"	: "Associate");

		String skillType = c.getSkillList().containsAll(nicheSkillList) ? "Niche" : "Regular";
		enhanceCustomer.setSkillType(skillType);

		System.out.println("Getting Desigation from BasicCustomer   " + enhanceCustomer.toString());

		return enhanceCustomer;

	}

}
