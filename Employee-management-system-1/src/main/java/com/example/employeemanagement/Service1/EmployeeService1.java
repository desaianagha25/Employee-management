package com.example.employeemanagement.Service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagement.Repository1.EmployeeRepository1;
import com.example.employeemanagement.entity1.Employee1;

import java.util.List;

@Service
public class EmployeeService1 {

	private EmployeeRepository1 employeeRepository1;

	@Autowired
	public EmployeeService1(EmployeeRepository1 employeeRepository1) {
		this.employeeRepository1 = employeeRepository1;
	}

	public List<Employee1> getAllEmployees() {
		return employeeRepository1.findAll();
	}

	public Employee1 getEmployeeById(Long id) {
		return employeeRepository1.findById(id).orElse(null);
	}

	public Employee1 createEmployee(Employee1 employee1) {
		return employeeRepository1.save(employee1);
	}

	public Employee1 updateEmployee(Long id, Employee1 employee1) {
		if (employeeRepository1.existsById(id)) {
			employee1.setId(id);
			return employeeRepository1.save(employee1);
		}
		return null;
	}

	public boolean deleteEmployee(Long id) {
		if (employeeRepository1.existsById(id)) {
			employeeRepository1.deleteById(id);
			return true;
		}
		return false;
	}

	public void saveEmployee(Employee1 employee1) {
		// TODO Auto-generated method stub
		
	}

	public Object getEmployeeById(int employee_id) {
		// TODO Auto-generated method stub
		return null;
	}

		
}
