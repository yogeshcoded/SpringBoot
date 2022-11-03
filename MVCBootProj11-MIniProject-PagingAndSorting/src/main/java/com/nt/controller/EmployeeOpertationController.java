package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;
import com.nt.validation.EmployeeValidator;




@Controller
public class EmployeeOpertationController {
	@Autowired
	private IEmployeeMgmtService service;
	@Autowired
	private EmployeeValidator empValidator;
	
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
		return "show_report2";
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

	/*@PostMapping("/emp_add")
	public String SaveEmployee(@ModelAttribute("emp") Employee emp, 
			                                          RedirectAttributes attrs) {
			                                   
		System.out.println("EmployeeOpertationController.SaveEmployee()");
		// use service
		String msg = service.registerEmployee(emp);
		// keep the result as flashAttribute
		attrs.addFlashAttribute("result", msg);
		// return LVN
		return "redirect:emp_report";
	}*/

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
	public String editEmployee(@ModelAttribute("emp") Employee emp, RedirectAttributes attrs,BindingResult errors) {
		System.out.println("EmployeeOpertationController.editEmployee()");
		// use Validator
				if (empValidator.supports(Employee.class)) {
					empValidator.validate(emp, errors);
					if (errors.hasErrors())
						return "show_edit_emp";
				}
		// use service
		String msg = service.UpdateEmployee(emp);
		// keep the result as flashAttribute
		attrs.addFlashAttribute("result", msg);
		// return LVN
		return "redirect:emp_report";
	}

	@GetMapping("/emp_delete")
	public String deleteEmployee(RedirectAttributes attrs, @RequestParam int eno) {
		System.out.println("EmployeeOpertationController.deleteEmployee()");
		// use service
		String msg = service.removeEmployee(eno);
		// keep the result as flashAttribute
		attrs.addFlashAttribute("result", msg);
		// return LVN
		return "redirect:emp_report";
	}

	@ModelAttribute("deptNoInfo")
	public List<Integer> refDataForDeptNoSelectbox() {
		System.out.println("EmployeeOpertationController.refDataForDeptNoSelectbox()");
		return service.fetchAllDeptNo();

	}

	@PostMapping("/emp_add")
	public String SaveEmployee(@ModelAttribute("emp") Employee emp, RedirectAttributes attrs, BindingResult errors) {
		System.out.println("EmployeeOpertationController.SaveEmployee()");
		if(emp.getActive().equalsIgnoreCase("no")) {
		// use Validator
		if (empValidator.supports(Employee.class)) {
			empValidator.validate(emp, errors);
			
			if(service.isDesgRejectedList(emp.getJob()))
			errors.rejectValue("job", "emp.desg.reject");
			
			if (errors.hasErrors())
				return "register_emp";
		}
		}
		// use service
		String msg = service.registerEmployee(emp);
		// keep the result as flashAttribute
		attrs.addFlashAttribute("result", msg);
		// return LVN
		return "redirect:emp_report";
	}
	@GetMapping("/report")
public String showEmployeeReport(@PageableDefault(page=0,size = 3,sort = "job",direction =Sort.Direction.ASC) Pageable pagebale,
		                                                       Map<String, Object>map) {
	System.out.println("EmployeeOpertationController.showEmployeeReport()");
	//use service
	Page<Employee> page=service.getEmpDataByPage(pagebale);
	//put model to scope
	map.put("empsData", page);
	//return LVN
	return "show_report";
		
	}
	
}//class
