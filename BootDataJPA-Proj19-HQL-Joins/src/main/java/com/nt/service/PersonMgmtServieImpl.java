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

@Service("pService")
public class PersonMgmtServieImpl implements IPersonService {
	@Autowired
	private IPersonRepository personRepo;

	@Autowired
	private IPhoneNumberRepository phoneRepo;

	
	@Override
	public List<Object[]> fetchDataUsingPersonByJoin() {
		return personRepo.fetchDataUsingPersonByJoin();
	}
}// class
