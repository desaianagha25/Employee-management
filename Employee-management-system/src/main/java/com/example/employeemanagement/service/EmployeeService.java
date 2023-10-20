package com.example.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;

public interface EmployeeService {
	List<Employee> getAllEmployee();

	Employee saveEmployee(Employee employee);

	Employee getEmployeeById(int employee_id);

	Employee updateEmployee(Employee employee);
}