package com.nt.runner;

import java.util.List;

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
		/*	Customer ct = new Customer();
			ct.setCno(1);
			ct.setCname("Bajaj");
			ct.setQty(10);
			ct.setPrice(300000);
	//	System.out.println(service.saveCustomerInfo(ct));
		*/
		System.out.println("=====================================");
		
		/*service.fetchCustomerInfo().forEach(cts -> {
			System.out.println(cts);
		});*/
		
		System.out.println("=====================================");
		
	Customer ct1 = new Customer(5, "TVS", 10, 50000);
	Customer ct2 = new Customer(6,"Maruti",75,90010);
	Customer ct3 = new Customer(7,"Mahindra",50,15000);
	
	System.out.println("Employees are saved "+service.saveAllCustomer(List.of(ct1,ct2,ct3)));
		
		
	//System.out.println(service.searchCustometById("63106240b7a41d409e2ce7df"));
	
	
	
//	System.out.println(service.updateCustometByInfo("631065630f098470f5259db5",150));
	
	//System.out.println(service.removeCustometByInfo("631065630f098470f5259db5"));
	
//	service.showAllCustomer(true,"cname").forEach(System.out::println);
	
	
	
	
	
	}//run method

}//class
