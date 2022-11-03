package com.nt.runner;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Repository.IActorRepository;
import com.nt.entity.Actor;

@Component
public class ActorRunnerTest implements CommandLineRunner {
@Autowired
	private IActorRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
	System.err.println("Actor NameEquals 1::");
	repo.findByActorNameEquals("Alia").forEach(System.out::println);
	
	System.err.println("Actor  ActorNameIs  2::");
	repo.findByActorNameEquals("Ranveer").forEach(System.out::println);

	System.err.println("Actor  CategoryOrActorName  3::");
	repo.findByCategoryOrActorName("hero", "Ranveer").forEach(System.out::println);
	
	System.err.println("Actor  CategoryAndActorName 4::");
	repo.findByCategoryAndActorName("hero", "bhava").forEach(System.out::println);
	
	System.err.println("Actor  Names Ending With are 5::");
	repo.findByActorNameEndingWith("a").forEach(System.out::println);
	
	System.err.println("Actor  Names LIke are 6::");
	repo.findByActorNameLike("%r").forEach(System.out::println);
	repo.findByActorNameLike("A%").forEach(System.out::println);
	repo.findByActorNameLike("J%i").forEach(System.out::println);
	
	System.err.println("Actor  Names Ending With are 7::");
	repo.findByAidBetween(1,6).forEach(System.out::println);
	
	System.err.println("Actor  Names NOT NULL are 8::");
	repo.findByActorNameNotNull().forEach(System.out::println);
	
	System.err.println("Actor  Names  NULL are 9::");
	repo.findByActorNameNull().forEach(System.out::println);
	
	System.err.println("Actor  EqualsIgnoreCase  are 10::");
	repo.findByCategoryEqualsIgnoreCase("art").forEach(System.out::println);
	
	System.err.println("Actor  ContainIgnoreCase  are 11::");
	repo.findByActorNameContainingIgnoreCase("j").forEach(System.out::println);
	
	
	
	
	
	
	
	}//run()
	

}//class
