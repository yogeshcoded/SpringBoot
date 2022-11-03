package com.nt.runner;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Customer;
import com.nt.service.ICustomerMgmtService;

@Component
public class MongoRunner implements CommandLineRunner {
	@Autowired
	private ICustomerMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		// create Customer object
			Customer ct = new Customer();
			ct.setId(UUID.randomUUID().toString());
			ct.setCno(1);
			ct.setCname("Bajaj");
			ct.setQty(10);
			ct.setPrice(300000);
		System.out.println(service.saveCustomerInfo(ct));
		
		System.out.println("=====================================");
		
		
	
	
	
	
	
	}//run method

}//class
