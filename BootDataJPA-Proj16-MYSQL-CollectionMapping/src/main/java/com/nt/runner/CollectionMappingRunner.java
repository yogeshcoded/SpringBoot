package com.nt.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.EmployeeInfo;
import com.nt.service.ICollectionMappingService;

@Component
public class CollectionMappingRunner implements CommandLineRunner {
	@Autowired
	private ICollectionMappingService service;

	@Override
	public void run(String... args) throws Exception {
		EmployeeInfo info = new EmployeeInfo();
		info.setEname("Nikhil");
		info.setFriends(List.of("Chinna", "Kanna", "bhujji"));
		info.setPhoneNumbers(Set.of(999999999L, 888888888L, 666666666L));
		info.setIdDetails(Map.of("aadhar",1234567,"voterID",789456));
		//sava the object 
		System.out.println("Emp info"+  service.registerEmpInfo(info));
	}

}
