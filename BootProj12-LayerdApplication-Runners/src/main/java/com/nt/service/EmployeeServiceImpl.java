package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;
@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	@Qualifier("oraDAO")
	private IEmployeeDAO dao;
	
	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl::0-param contructor ");
	}

	@Override
	public List<Employee> fetchAllEmployeesDesgs(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeServiceImpl.fetchAllEmployeesDesgs()");
		// use dao
		List<Employee> list = dao.getEmployeeByDesgs(desg1, desg2, desg3);
		return list;
	}// method

}// class
