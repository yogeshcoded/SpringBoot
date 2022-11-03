package com.nt.service;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {
	public Iterable<Employee> fetchAllEmployee();
	public String registerEmployee(Employee emp);
	public Employee getEmployeeById(int no);
	public String UpdateEmployee(Employee emp);
	public String removeEmployee(int eno);
	
}
