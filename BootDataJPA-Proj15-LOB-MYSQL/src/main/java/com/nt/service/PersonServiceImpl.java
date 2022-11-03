package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nt.entity.Person;
import com.nt.repository.ILOBRepository;

@Service("pService")
public class PersonServiceImpl implements IPersonService {
	@Autowired
	private ILOBRepository repo;

	@Override
	public String registerPersonInfo(Person info) {
		return repo.save(info).getPid() + " Person save";
	}

	@Override
	public Person fetchPersonByPid(int pid) {
		return repo.findById(pid).orElseThrow(() -> new IllegalArgumentException("PErson not found"));
	}

}
