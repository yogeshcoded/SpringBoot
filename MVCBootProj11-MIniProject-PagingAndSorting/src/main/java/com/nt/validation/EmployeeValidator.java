package com.nt.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.model.Employee;

@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(Employee.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Employee emp = (Employee) target;
//form validation for server side 
		if (emp.getEname() == null || emp.getEname().isBlank())
			errors.rejectValue("ename", "emp.name.required");
		else if (emp.getEname().length() <5 || emp.getEname().length() >= 20)
			errors.rejectValue("ename", "emp.name.length");

		if (emp.getJob() == null || emp.getJob().isBlank())
			errors.rejectValue("job", "emp.job.required");
		else if (emp.getJob().length() < 5 || emp.getJob().length() >10)
			errors.rejectValue("job", "emp.job.length");
		
	
		if (emp.getSal() == null )
			errors.rejectValue("sal", "emp.salary.required");
		else if (emp.getSal()<5000 || emp.getSal()>200000 )
			errors.rejectValue("sal", "emp.salary.range");
		
		
	
		
		
	}

}
