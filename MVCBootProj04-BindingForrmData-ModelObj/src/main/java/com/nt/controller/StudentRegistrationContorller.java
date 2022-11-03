package com.nt.controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;


@Controller
public class StudentRegistrationContorller {
	@GetMapping("/")
	public String	 launchHome() {
		System.out.println("StudentRegistrationContorller.launchHome()");
		return "welcome";
			}
	
	@GetMapping("/register")
	public String	 showForm() {
		System.out.println("StudentRegistrationContorller.showForm()");
		return "student_register";
	}
	
	@PostMapping("/register")
	public String registerStudent(Map<String, Object> map, @ModelAttribute("stud") Student st) {
		// generate result
		String grade=null;
		if(st.getAvg()>=75)
			grade= " First class With Distinction";
		else if(st.getAvg()>=60)
			grade= " First  class ";
		else if(st.getAvg()>=50)
			grade= " Second class ";
		else if(st.getAvg()>=35)
			grade= " Third class ";
		else 
			grade="fail";
		map.put("result", grade);
		return "std_result";                        
	
}
}
