package com.example.lauren.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lauren.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
