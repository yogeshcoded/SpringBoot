package com.nt.controller;

import java.util.Map;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;



@Controller
public class EmployeeOpertationController {
	@Autowired
	private IEmployeeMgmtService service;

	@GetMapping("/")
	public String launchHome() {
		System.out.println("EmployeeOpertationController.launchHome()");
		// return LVN
		return "home";
	}

	@GetMapping("/emp_report")
	public String showEmployeeReport(Map<String, Object> map) {
		System.out.println("EmployeeOpertationController.showEmployeeReport()");
		Iterable<Employee> itEmp = service.fetchAllEmployee();
				map.put("empsList", itEmp);
		// return LVN
		return "show_report";
	}

	@GetMapping("/emp_add")
	public String showFormSaveEmployee(@ModelAttribute("emp") Employee emp) {
		System.out.println("EmployeeOpertationController.showFormSaveEmployee()");
		// return LVN
		return "register_emp";
	}

	/*@PostMapping("/emp_add")
	public String SaveEmployee(@ModelAttribute("emp") Employee emp, Map<String, Object> map) {
		System.out.println("EmployeeOpertationController.SaveEmployee()");
	//use service
		String msg = service.registerEmployee(emp);
		//keep the result in  ModelAttribute
		map.put("result", msg);
		// return LVN
		return "redirect:emp_report";
	}*/

	@PostMapping("/emp_add")
	public String SaveEmployee(@ModelAttribute("emp") Employee emp, RedirectAttributes attrs) {
		System.out.println("EmployeeOpertationController.SaveEmployee()");
		// use service
		String msg = service.registerEmployee(emp);
		// keep the result as flashAttribute
		attrs.addFlashAttribute("result", msg);
		// return LVN
		return "redirect:emp_report";
	}

	/*@PostMapping("/emp_add")
	public String SaveEmployee(@ModelAttribute("emp") Employee emp, HttpSession sec) {
		System.out.println("EmployeeOpertationController.SaveEmployee()");
		// use service
		String msg = service.registerEmployee(emp);
		// keep the result as flashAttribute
		sec.setAttribute("result", msg);
		// return LVN
		return "redirect:emp_report";
	}*/

	@GetMapping("/emp_edit")
	public String showeditEmployeeFormPag(@RequestParam int no, @ModelAttribute("emp") Employee emp) {
		System.out.println("EmployeeOpertationController.showeditEmployeeFormPag()");
		// use service
		Employee emp1 = service.getEmployeeById(no);
		// copy data
		BeanUtils.copyProperties(emp1, emp);
		// return LVN
		return "show_edit_emp";
	}

	@PostMapping("/emp_edit")
	public String editEmployee(@ModelAttribute("emp") Employee emp, RedirectAttributes attrs) {
		System.out.println("EmployeeOpertationController.editEmployee()");
		// use service
		String msg = service.UpdateEmployee(emp);
		// keep the result as flashAttribute
		attrs.addFlashAttribute("result", msg);
		// return LVN
		return "redirect:emp_report";
	}
	@GetMapping("/emp_delete")
	public String deleteEmployee(RedirectAttributes attrs,@RequestParam int eno) {
		System.out.println("EmployeeOpertationController.deleteEmployee()");
		// use service
		String msg = service.removeEmployee(eno);
		// keep the result as flashAttribute
		attrs.addFlashAttribute("result", msg);
		// return LVN
		return "redirect:emp_report";
	}
}
