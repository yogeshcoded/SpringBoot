package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.ICustomerMgmtService;

@Component
public class MongoRunner implements CommandLineRunner {
	@Autowired
	private ICustomerMgmtService service;

	@Override
	public void run(String... args) throws Exception {

		//service.searchCutomerByPriceBetween(10000, 10000).forEach(System.out::println);
		
		service.getCutometByCid("631065630f098470f5259db6").forEach(view->{
		for(Object val:view)
			System.out.print(val+"  ");
			System.out.println();
		});
		
	

	}// run method

}// class
