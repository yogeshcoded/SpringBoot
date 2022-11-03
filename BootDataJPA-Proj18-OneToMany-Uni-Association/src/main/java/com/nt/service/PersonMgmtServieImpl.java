package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.repository.IPersonRepository;
import com.nt.repository.IPhoneNumberRepository;

@Service("uniDService")
public class PersonMgmtServieImpl implements IPersonService {
	@Autowired
	private IPersonRepository personRepo;
	@Autowired
	private IPhoneNumberRepository phoneRepo;

	@Override
	public String registerPersonInfo(Person per) {
		return "Person and PhoneNumer  is save with id Value is" + personRepo.save(per).getPid();
	}// method

	@Override
	public List<Person> fetchDataUsingPerson() {
		return personRepo.findAll();
	}// method

	@Override
	public String addPhNoToExistingPerson(int pid) {
		// load the person object
		Person person = personRepo.getReferenceById(pid);
		Set<PhoneNumber> child = person.getPhoneNumbers();
		// create the child object
		PhoneNumber ph = new PhoneNumber();
		ph.setPhone_type("college");
		ph.setPhoneNumer(789456L);
		ph.setProvider("VI");
		personRepo.save(person);
		return "Phones are added to person";

	}// method

	@Override
	public String deleteAllChildByParent(int pid) {
		// Load Parent object
		Optional<Person> opt = personRepo.findById(pid);
		if (opt.isPresent()) {
			// get childs of a parent
			Set<PhoneNumber> childs = opt.get().getPhoneNumbers();
			/*  childs.forEach(ph->{
				  phoneRepo.delete(ph);
			  });*/
			phoneRepo.deleteAll(childs);
			return "All childs(PhoneNumbers) of a Person are deleted";
		} // deleteAllChild()
		else {
			return "Person not found";
		} // else
	}// method

	@Override
	public String deleteParetnAndChild(int pid) {
		// load the parent object
		Optional<Person> opt = personRepo.findById(pid);
		if (opt.isPresent()) {
			personRepo.delete(opt.get()); // if we delete parent obj.. the associated child object will be deleted
			return "Person  and his PhoneNumbers are deleted";
		} // if
		else {
			return "Person Not Found";
		} // else
	}

	@Override
	public String deleteOneChildFromParent(int regid) {
			//load child object 
		Optional<PhoneNumber>opt=phoneRepo.findById(regid);
		if(opt.isPresent()) {
			//delete the specific phone no
			phoneRepo.delete(opt.get());
			return "PhoneNo are delete ";
		}//if
		else {
			return "Not found";
		}//else
		}//method
	
	
	
		
	

	
	
}// class
