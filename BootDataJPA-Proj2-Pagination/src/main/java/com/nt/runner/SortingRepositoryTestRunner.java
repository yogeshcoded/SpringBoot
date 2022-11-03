package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.IActorMgmtService;

@Component
public class SortingRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IActorMgmtService service;

	@Override
	public void run(String... args) throws Exception {
	
		/*	service.showActorByOrder(false,"aid").forEach(System.out::println);	 // Descending order
			service.showActorByOrder(true,"aid","actorName").forEach(System.out::println); // Ascending Order
		*/
		//pagination
		/*	Page<Actor> page=service.showPageRecords(	0, 3);
			List<Actor> list=page.getContent();
			System.out.println("Records are ::");
			list.forEach(System.out::println);
		   System.out.println("Other info about page::");
		   System.out.println("Current  page No:: "+page.getNumber());
		   System.out.println("Total page No::  "+page.getTotalPages());
		   System.out.println("Total page recods::  "+page.getTotalElements());
		   System.out.println("First  page::  "+page.isFirst());
		   System.out.println("Last page::  "+page.isLast());
		   */
	   //page size
	  // service.showActorRecords(3);
	   
		service.showPageByRecords(2, 3).forEach(System.out::println);
	}// run(-,-)
}// class