package com.nt.service;


import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.repository.IPersonRepository;
import com.nt.repository.IPhoneNumberRepository;

@Service("pService")
public class PersonMgmtServieImpl implements IPersonService {
	@Autowired
	private IPersonRepository personRepo;

	@Autowired
	private IPhoneNumberRepository phoneRepo;

	@Override
	public String registerPersonInfo(Person per) {
		return "Person and PhoneNumer  is save with id Value is" + personRepo.save(per).getPid();
	}

	/*	@Override
		public String registerPhoneNumerInfo(Set<PhoneNumber> phones) {
			List<String> msg = new ArrayList();
			if (phones.size() > 0) {
				for (PhoneNumber ph : phones) {
					msg.add("PhoneNo and Perso are save with" + phoneRepo.save(ph) + " id value");
				}
			}
			return msg.toString();
		}*/
	
		@Override
		public String registerPhoneNumerInfo(Set<PhoneNumber> phones) {
			int count = phoneRepo.saveAll(phones).size();
			return count+" PhoneNumbers and Person is saved";
		}

		@Override
		public Iterable<Person> fetchDataUsingPerson() {
			Iterable<Person> it=personRepo.findAll();
			return it;
		}

		@Override
		public Iterable<PhoneNumber> fetchDataUsingChild() {
			return phoneRepo.findAll();
		}

				
		@Override
		public String deleteDataUsingPerson(int pid) {
			// load the person object 
			Optional<Person> opt=personRepo.findById(pid);
			if(opt.isPresent()) {
			personRepo.delete(opt.get());
				return "All Parent tochild record are deleted";
		}
			return "Record not found";
		}
			
		
		@Override
		public String deleteDataUsingPhoneNumber(int pid) {
			//load parent class object
			Optional<Person> opt=personRepo.findById(pid);
			if(opt.isPresent()) {                        //check person is their or not
				//get child  from parent
			Set<PhoneNumber> childs=opt.get().getPhoneNumbers();
		       phoneRepo.deleteAll(childs);
		       return "All Childs to parent Record are deleted";
			}//if
			return "Person not found";
		}//method
		
		public String deleteAllPhoneNumbersOfAPerson(int pid) {
			//Load Parent obj
			Optional<Person> opt=personRepo.findById(pid);
			if(opt.isPresent()) {
				//get all childs of a parent
				Set<PhoneNumber>  childs=opt.get().getPhoneNumbers();
				//delete all childs 
				childs.forEach(ph->{
					ph.setPerson(null);
				});
				phoneRepo.deleteAll(childs);
				return childs.size()+" Phonenumbers of "+pid +"Person are deleted";
			}
			return pid+" Person not found";
		}
}// class
