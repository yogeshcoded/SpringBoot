package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repository.IEmpRepository;

@Service("empService")
public class EmployeeMgmtService implements IEmployeeMgmtService {
	@Autowired
	private IEmpRepository empRepo;

	@Override
	public Iterable<Employee> fetchAllEmployee() {
		return empRepo.findAll();
	}

	

}
