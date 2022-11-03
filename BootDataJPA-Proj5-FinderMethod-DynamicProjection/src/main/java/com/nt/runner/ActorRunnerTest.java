package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IActorRepository;
import com.nt.view.ResultView1;
import com.nt.view.ResultView2;
import com.nt.view.ResultView3;

@Component
public class ActorRunnerTest implements CommandLineRunner {
	@Autowired
	private IActorRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
	Iterable<ResultView1> it1=repo.findByCategoryContainingIgnoreCase("h", ResultView1.class);
    it1.forEach(view1->{
    	System.out.println(view1.getAid()+"     "+view1.getActorName());
    });
       
  Iterable<ResultView2> it2=repo.findByCategoryContainingIgnoreCase("h",ResultView2.class);
     it2.forEach(v->{
    	 System.out.println(v.getCategory()+"   "+v.getMobile());
     });
    
     Iterable<ResultView3> it3=repo.findByCategoryContainingIgnoreCase("h",ResultView3.class);
     it3.forEach(v1->{
    	 System.out.println(v1.getCategory()+"   "+v1.getAid()+"  "+v1.getActorName());
     });
    
       }//runn

	}//class


