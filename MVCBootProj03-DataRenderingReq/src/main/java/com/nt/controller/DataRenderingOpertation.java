package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.Employee;
@Controller
public class DataRenderingOpertation {
	@RequestMapping("/pro")
public String showProcess() {
		System.out.println("DataRenderingOpertation.showProcess()");
	return "display";
}
	@RequestMapping("/report")
	public String showProcessResult() {
		System.out.println("DataRenderingOpertation.showProcessResult()");
		return "display";
	}
	
	@GetMapping
	public String showHome() {
		System.out.println("DataRenderingOpertation.showHome()");
	return "welcome";
}
	@PostMapping
	public String showHome1() {
		System.out.println("DataRenderingOpertation.showHome1()");
		return "display";
	}
	
	@GetMapping("/result")
	public String showData(Map<String, Object>map) {
		System.out.println("DataRenderingOpertation.showData()");
		map.put("name", "raja");
		map.put("age", 55);
		return "show_result";
	}
	@GetMapping("/process")
	public String showDataInfo(Map<String, Object>map) {
		System.out.println("DataRenderingOpertation.showDataInfo()");
		map.put("favColor", new String[] {"red","blue","cyan"});
		map.put("nickNames", List.of("raja","raj","maharaj"));
		map.put("phoneNo", Set.of(9999999,8888888,555555));
		map.put("idDetails", Map.of("aadharCard",788548,"pancard",451888));
		return "disdata";
	}
	
	@GetMapping("/show")
	public String showInfo(Map<String, Object>map) {
		System.out.println("DataRenderingOpertation.showInfo()");
		//create emp object
		Employee emp=new Employee();
		emp.setEid(101);emp.setEname("Raja");
		emp.setJob("CLERK"); emp.setAddrs("Hyd");
		emp.setSalary(25000); emp.setIsVaccinated(true);
		//add model class to Model attribute
		map.put("empinfo", emp);
		//return LVN
		return"info";
	}
	
	@GetMapping("/data")
	public String dataEmp(Map<String, Object>map) {
		System.out.println("DataRenderingOpertation.dataEmp()");
		//create List object
	   List<Employee> list=List.of(new Employee(102,"Mahi","pune","mgr",544000,false),
			   new Employee(103,"Paresh","Thane","Analyst",87050,true),
			   new Employee(104,"	ramesh","Vizag","devp",98400,true));
	   //add list object to model atribute
	   map.put("eList", list);
		return "data_info";
		
	}
	
	
	
	
	
	
	
	
}
