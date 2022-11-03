package com.nt.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;

@Component
public class ActorRunnerTest implements CommandLineRunner {
	@Autowired
	private IActorRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		int result=repo.insertActor("Chinna", "bega", 5848566L);
		System.out.println(result==0?"Record not insert":"record is insert");
	System.out.println("date:: "+repo.showDate());
		
	}// run

}// class
