package com.nt.service;

import java.util.List;
import java.util.Set;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;

public interface IPersonService {
	//save parent to child  data
	public String registerPersonInfo(Person per);
	
	public List<Person> fetchDataUsingPerson();
	
	public String addPhNoToExistingPerson(int pid);
	
	public String deleteAllChildByParent(int pid);
	
    public String deleteOneChildFromParent(int regid);
    
	public String deleteParetnAndChild(int pid);
	
	 
}
