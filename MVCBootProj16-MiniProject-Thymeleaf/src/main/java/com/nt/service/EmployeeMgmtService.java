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

	@Override
	public String registerEmployee(Employee emp) {
		return "Employee save with id val:" + empRepo.save(emp).getEmpno();
	}

	@Override
	public Employee getEmployeeById(int no) {
		Employee emp = empRepo.findById(no).orElseThrow(() -> new IllegalArgumentException());
		return emp;
	}

	@Override
	public String UpdateEmployee(Employee emp) {
		return "Employee update with id value " + empRepo.save(emp).getEmpno();
	}

	@Override
	public String removeEmployee(int eno) {
		empRepo.deleteById(eno);
		return eno + " emp are deleted";
	}

}
