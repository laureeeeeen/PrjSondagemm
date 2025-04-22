package com.example.lauren.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lauren.entities.Employee;
import com.example.lauren.entities.Project;
import com.example.lauren.services.EmployeeService;
import com.example.lauren.services.ProjectService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private final EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/id")
	public Employee getEmployee(@PathVariable Long id) {
		return employeeService.findEmployeeByid(id);
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmployee(){
		return employeeService.findAllEmployee();
	}
}
