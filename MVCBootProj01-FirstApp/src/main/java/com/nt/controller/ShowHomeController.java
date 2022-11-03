package com.nt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ShowHomeController {
	/*@RequestMapping("/home")
		public String showHome() {
			//return logical view name
			return "welcome";
				}*/


	/*@RequestMapping("/")
	public String launchHome() {
		//return logical view name
		return "welcome";
	}*/
	
	/*@RequestMapping("/process")
	public String launchHome(Map<String,Object> map) {
		System.out.println("ShowHomeController.launchHome()");
	map.put("attr1", "val1");
	map.put("sysDate",LocalDateTime.now());
		return "welcome";
	}*/


	/*@RequestMapping("/process")
	public String launchHome(Model model) {
		System.out.println("ShowHomeController.launchHome()"+model.getClass());
		model.addAttribute("attr1", "Val1");
		model.addAttribute("sysDate",LocalDateTime.now());
		return "welcome";
	}*/
	/*@RequestMapping("/process")
	public String process(ModelMap map) {
		System.out.println("ShowHomeController.launchHome()"+map.getClass());
		map.addAttribute("attr1", "Val1");
		map.addAttribute("sysDate",LocalDateTime.now());
		return "show_result";
	}*/

//Taking RT 
	
	/*@RequestMapping("/process")
	public Model process() {
		//create Model class object manually
		Model model =new BindingAwareModelMap();
		System.out.println("ShowHomeController.launchHome()");
		model.addAttribute("attr1", "Val1");
		model.addAttribute("sysDate",LocalDateTime.now());
		return model;
	}*/
	/*@RequestMapping("/process")
	public Map<String,Object> process() {
		//create Model class object manually
		Map map =new HashMap();
		System.out.println("ShowHomeController.launchHome()");
		map.put("attr1", "Val1");
		map.put("sysDate",LocalDateTime.now());
		return map;
	}*/
	/*@RequestMapping("/process")
	public ModelAndView process() {
		//create Model class object manually
		ModelAndView mav =new ModelAndView();
		System.out.println("ShowHomeController.launchHome()");
		mav.addObject("attr1", "Val1");
		mav.addObject("sysDate",LocalDateTime.now());
		//set LVN
		mav.setViewName("show_result");
		return mav;
	}*/
	/*@RequestMapping("/process")
	public void process(Map<String,Object> map) {
		map.put("attr1", "val1");
		map.put("sysDate",new Date());
				return;
	}*/
	/*@RequestMapping("/process")
	public String process(Map<String,Object> map) {
		map.put("attr1", "val1");
		map.put("sysDate",new Date());
		return null;
	}*/
	/*@RequestMapping("/process")
	public String process() {
		System.out.println("ShowHomeController.process()");
		return "forward:report";
	}
	@RequestMapping("/report")
	public String processReport() {
		System.out.println("ShowHomeController.processReport()");
		return "show_result";
	}*/
	@RequestMapping("/process")
	public String process(HttpServletRequest req) {
		System.out.println("ShowHomeController.process()");
		req.setAttribute("attr1", "val1");
		return "redirect:report";
	}
	@RequestMapping("/report")
	public String processReport(HttpServletRequest req) {
		System.out.println("ShowHomeController.processReport()"+req.getAttribute("attr1"));
		return "show_result";
	}
}//class
