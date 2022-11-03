package com.nt.runner;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.DrivingLIcense;
import com.nt.document.Person;
import com.nt.service.IRTOMgmtService;

@Component
public class RunnerTestOTO implements CommandLineRunner {
	@Autowired
	private IRTOMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		/*	Person person=new Person(new Random().nextInt(10000),"Rahul","Hyd");
			DrivingLIcense dl=new DrivingLIcense(new Random().nextLong(10000),"LMV",LocalDateTime.of(2030,10, 15, 14, 30));
			person.setDrivingLIcense(dl);*/
		// System.out.println(service.saveDataUsingPerson(person));
		System.out.println("======================================================");
		/*Person person = new Person(new Random().nextInt(10000), "Mahi", "Pune");
		DrivingLIcense dl = new DrivingLIcense(new Random().nextLong(10000), "HMV",
				LocalDateTime.of(2045, 6, 15, 14, 30));
		dl.setPersonDetails(person);
		System.out.println(service.saveDataUsingDL(dl));*/
		System.out.println("======================================================");
		service.fetchDataUsingPerson().forEach(per -> {
			System.out.println("Person:: " + per);
			DrivingLIcense dL = per.getDrivingLIcense();
			System.out.println("DrivingLIcense:: " + dL);
		});
		System.out.println("======================================================");
		service.fetchDataUsingChild().forEach(lic -> {
			System.out.println("DrivingLIcense:: " + lic);
			Person pers=lic.getPersonDetails();
			System.out.println("Person:: " + pers);
		});
	}//run
}//class
