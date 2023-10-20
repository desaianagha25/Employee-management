package com.example.employeemanagement.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import com.example.employeemanagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee) ;
	}
	@Override
	public Employee getEmployeeById(int employee_id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(employee_id).get();
	}
	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

}









