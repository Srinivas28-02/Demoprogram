package com.nit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.model.Employee;
import com.nit.service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/getAllEmployees")
	public String getAllEmployees(Model model){
		model.addAttribute("emps", employeeService.getAllEmployees());
		return "show_employees";
	}
	
	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(HttpServletRequest request){
		String empId = request.getParameter("emp_id");
		employeeService.deletelEmployee(Long.valueOf(empId));
		return "redirect:/getAllEmployees";
	}
	@RequestMapping("/addEmployee")
	public String addEmployee(Model model){
		model.addAttribute(new Employee());
		return "add_employee";
	}
	@RequestMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute Employee emp){
		employeeService.saveEmployee(emp);
		return "redirect:/getAllEmployees";
	}
	
	@RequestMapping("/editEmployee")
	public String editEmployee(HttpServletRequest request, Model model){
		String empId = request.getParameter("emp_id");
		Employee emp = employeeService.getEmployee(Long.valueOf(empId));
		model.addAttribute(emp);
		return "edit_employee";
	}
	
	@RequestMapping("/updateEmployee")
	public String updateEmployee(@ModelAttribute Employee emp){
		employeeService.updateEmployee(emp);
		return "redirect:/getAllEmployees";
	}
}