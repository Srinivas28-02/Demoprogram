package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.services.EmployeeServices;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployeeController {
	@Autowired
	public EmployeeServices employeeService;

	@RequestMapping("/getAllEmployees")
	public String getAllEmployees(Model model) {
		model.addAttribute("emps", employeeService.getAllEmployees());
		return "show_employees";
	}

	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(HttpServletRequest request) {
		String empId = request.getParameter("emp_id");
		employeeService.deletelEmployee(Long.valueOf(empId));
		return "redirect:/getAllEmployees";
	}
}
