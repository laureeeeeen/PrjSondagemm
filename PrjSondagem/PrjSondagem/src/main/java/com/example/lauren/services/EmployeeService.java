package com.example.lauren.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.lauren.entities.Employee;
import com.example.lauren.repositories.AlunoRepository;
import com.example.lauren.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	
private final EmployeeRepository employeeRepository;
	
public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public Employee findEmployeeByid(Long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		return employee.orElse(null);
	}
	
	public List<Employee> findAllEmployee(){
		return employeeRepository.findAll();
	}
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
}
