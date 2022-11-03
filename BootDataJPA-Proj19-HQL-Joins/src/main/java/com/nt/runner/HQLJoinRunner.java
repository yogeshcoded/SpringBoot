package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IPersonService;

@Component
public class HQLJoinRunner implements CommandLineRunner {
	@Autowired
	private IPersonService service;

	@Override
	public void run(String... args) throws Exception {

		service.fetchDataUsingPersonByJoin().forEach(ph->{
			for(Object val:ph) {
				System.out.print(val+"  ");
			}
			System.out.println();
		});;

	}// run()
}// class
