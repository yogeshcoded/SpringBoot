package com.nt.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.repository.IPhoneNumberRepository;
import com.nt.service.IPersonService;

@Component
public class OneToManyUniRunner implements CommandLineRunner {
	@Autowired
	private IPersonService service;

	@Override
	public void run(String... args) throws Exception {
		// save parent to child
		Person per = new Person();
		per.setPname("Shiva");
		per.setPaddrs("Pune");

		PhoneNumber ph1 = new PhoneNumber();
		ph1.setPhone_type("Site");
		ph1.setProvider("Hutch");
		ph1.setPhoneNumer(1111111L);

		PhoneNumber ph2 = new PhoneNumber();
		ph2.setPhone_type("Home");
		ph2.setProvider("BSNL");
		ph2.setPhoneNumer(994944L);
		// set child to parent
		per.setPhoneNumbers(Set.of(ph1, ph2));

		/*try {
				System.out.println(service.registerPersonInfo(per));
			} catch (Exception e) {
				e.printStackTrace();
			}*/
		
//load the data using parent
		/*try {
			List<Person> list = service.fetchDataUsingPerson();
			list.forEach(person -> {
				System.out.println(person);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// adding phone no to existing person

		/*	try {
				System.out.println(service.addPhNoToExistingPerson(1));
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Problem to added phone ");
			}*/
		
		//deleteAllChildByParent
		/*try {
			System.out.println(service.deleteAllChildByParent(1));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ph no is not delete");
		}*/

		/*try {
				System.out.println(service.deleteParetnAndChild(2));
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ph no is not delete");
			}*/
		
	try {
		System.out.println(service. deleteOneChildFromParent(102));
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Problem to delete phone no");
	}
	
	
		
		
		
		
		
	}// run()

}//calss
