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
		/*service.getCustomerDetails(5).forEach(cust->{
			for(Object val:cust) {
				System.out.println(val+"  ");
			}
			System.out.println();
		});;
		System.out.println("=====================================");*/

		//service.getAllCustomerinfo(6).forEach(System.out::println);
		
		System.out.println("=====================================");
		service.getAllCustomerDetailByQtyAndPrice(10, 150000).forEach(System.out::println);
		
		System.out.println("=====================================");
		//service.getAllCustomerDataByPriceRange(50000, 300000).forEach(System.out::println);

		/*	System.out.println("=====================================");
			service.getAllCustomerDataByCnames("Bajaj", "TVS").forEach(System.out::println);*/
		
		/*	System.out.println("=====================================");
			service.getAllCustomerDataByInitalCharacters("b").forEach(System.out::println);*/
		
		
		
	}// run method

}// class
