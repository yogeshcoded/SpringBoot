package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Service.IActorMgmtService;
import com.nt.entity.Actor;
@Component
public class ActorRunnerTest implements CommandLineRunner {
	@Autowired
private IActorMgmtService service;
	@Override
	public void run(String... args) throws Exception {
// ========================deleteAllbyidinbatch================================
		   // System.out.println(service.removeActorByIdBatch(List.of(2,3,4,53)));
		    
// ========================getbyreferance================================
//		  System.out.println(service.searchActorByid(1));
		Actor actor=service.searchActorByid(5);
		System.out.println(actor.getActorName());
		System.out.println(actor.getCategaery());
		  System.out.println(actor.getClass()+"   "+actor.getClass().getSuperclass());
		  System.out.println(actor.getClass().getDeclaredMethods());
		    
// ========================findAll================================
		// service.searchAll().forEach(System.out::println);
		
		//=================searchActorByActor(Actor actor, boolean order, String... properties)============
		/*Actor actor=new Actor(1,"Ranveer", "Sper Hero", 9845777777L);
		service.searchActorByActor(actor, true, "aid").forEach(System.out::println);*/
	}//run()

}//class
