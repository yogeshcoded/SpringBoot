package com.nt.runner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.service.IPersonService;

@Component
public class OneToManyRunner implements CommandLineRunner {
	@Autowired
	private IPersonService service;

	@Override
	public void run(String... args) throws Exception {
		// save parent to child
		Person per = new Person();
		per.setPname("Raja");
		per.setPaddrs("Hyd");

		PhoneNumber ph1 = new PhoneNumber();
		ph1.setPhone_type("Office");
		ph1.setProvider("Jio");
		ph1.setPhoneNumer(9999999L);

		PhoneNumber ph2 = new PhoneNumber();
		ph2.setPhone_type("Home");
		ph2.setProvider("BSNL");
		ph2.setPhoneNumer(888888L);

		// mapping the objects
		ph1.setPerson(per);
		ph2.setPerson(per);
		Set<PhoneNumber> phNo = new HashSet<PhoneNumber>();
		phNo.add(ph1);
		phNo.add(ph2);
		per.setPhoneNumbers(phNo);

		try {
			System.out.println(service.registerPersonInfo(per));
		}catch(Exception e) {
			e.printStackTrace();
		}

		// save parent to child
		/*	Person per = new Person();
			per.setPname("Mahi");
			per.setPaddrs("Pune");
		
			PhoneNumber ph1 = new PhoneNumber();
			ph1.setPhone_type("Residency");
			ph1.setProvider("Airtel");
			ph1.setPhoneNumer(9999999L);
		
			PhoneNumber ph2 = new PhoneNumber();
			ph2.setPhone_type("Office");
			ph2.setProvider("VI");
			ph2.setPhoneNumer(888888L);
		
			// mapping the objects
			ph1.setPerson(per);
			ph2.setPerson(per);
			Set<PhoneNumber> phNo = new HashSet<PhoneNumber>();
			phNo.add(ph1);
			phNo.add(ph2);
			per.setPhoneNumbers(phNo);*/

		/*				try {
							System.out.println(service.registerPhoneNumerInfo(phNo));
						}catch(Exception e) {
							e.printStackTrace();*/

		/*		try {
					Iterable<Person> list = service.fetchDataUsingPerson();
					list.forEach(person -> {
						System.out.println(person);
						Set<PhoneNumber> phoneNo = person.getPhoneNumbers();
						phoneNo.forEach(ph -> {
							System.out.println(ph);
						});
			});
					}
					 catch (Exception e) {
					              e.printStackTrace();
				}*/
		/*try {
				Iterable<PhoneNumber>list =service.fetchDataUsingChild();
				list.forEach(phoneNumber->{
					System.out.println(phoneNumber);
					Person pers=phoneNumber.getPerson();
					System.out.println(pers);
				});
			}catch(Exception e) {
				e.printStackTrace();
		}*/

		/*try {
			String msg = service.deleteDataUsingPerson(1);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Problem to delete the person");
		}*/

		
		/*try {
			String msg = service.deleteDataUsingPhoneNumber(8);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Problem to delete the person");
		}*/
		

		/*try {
			System.out.println(service.deleteAllPhoneNumbersOfAPerson(21)); 
						}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Problem to delete the person");
		}*/
		
	}// run()
}// class
