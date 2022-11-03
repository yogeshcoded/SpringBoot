package com.nt.service;

import java.util.Set;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;

public interface IPersonService {

	public String registerPersonInfo(Person per);
	public String registerPhoneNumerInfo(Set<PhoneNumber> phones);

	public Iterable<Person> fetchDataUsingPerson();
	public Iterable<PhoneNumber> fetchDataUsingChild();
	
	public String deleteDataUsingPerson(int pid);
	public String deleteDataUsingPhoneNumber(int pid);
	
	public String deleteAllPhoneNumbersOfAPerson(int pid);

}
