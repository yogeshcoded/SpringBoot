package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {
	public Iterable<Employee> fetchAllEmployee();
	public String registerEmployee(Employee emp);
	public Employee getEmployeeById(int no);
	public String UpdateEmployee(Employee emp);
	public String removeEmployee(int eno);
	public List<Integer> fetchAllDeptNo();
	
	public boolean isDesgRejectedList(String desg);
	
	public Page<Employee> getEmpDataByPage(Pageable pageable);
}
