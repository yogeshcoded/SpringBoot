package com.nt.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST,reason = "Enter empid not found")
public class EmployeeNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;
     public EmployeeNotFoundException() {
		super();
	}
     
     public EmployeeNotFoundException(String msg) {
    	 super(msg);
     }
     
}
