package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.DrivingLIcense;
import com.nt.document.Person;
import com.nt.repository.IDrivingLicenseRepository;
import com.nt.repository.IPersonRepository;

@Service("rtoService")
public class RTOMgmtServiceImpl implements IRTOMgmtService {
	@Autowired
	private IPersonRepository personRepo;
	@Autowired
	private IDrivingLicenseRepository dlRepo;

	@Override
	public String saveDataUsingPerson(Person per) {
		return "Person save with is value  " + personRepo.save(per).getPid();
	}

	@Override
	public String saveDataUsingDL(DrivingLIcense lIcense) {
				return"DL Info save with lIcense No :: "+ dlRepo.save(lIcense).getLicenseNo();
	}

	@Override
	public List<Person> fetchDataUsingPerson() {
		return personRepo.findAll();
	}

	@Override
	public List<DrivingLIcense> fetchDataUsingChild() {
		return dlRepo.findAll();
	}

}
