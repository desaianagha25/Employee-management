package com.example.employeemanagement.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import com.example.employeemanagement.service.EmployeeService;

@Controller
public class EmployeeController {
	private EmployeeRepository employeeRepository;
	private EmployeeService employeeService;
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
//handler method to handle list of students return mode and view
	@GetMapping("/employee")
	public String listEmployee(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployee());
		return "employees";
	}
	@GetMapping("/employee/new")
	public String createEmployeeform(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "create_employee";
	}
	// handler method for create data in UI
	@PostMapping("/employee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employee";
	}
	@GetMapping("/employee/edit/{employee_id}")
	public String editEmployeeForm(@PathVariable int employee_id, Model model) {
		model.addAttribute("employee", employeeService.getEmployeeById(employee_id));
		return "edit_employee";
	}
	@PostMapping("/employee/{employee_id}")
	public String updateEmployee(@PathVariable("employee_id") int employee_id, // Specify the variable name
			@ModelAttribute("employee") Employee employee, Model model) {
		{
			// get employee from database
			Employee existingEmployee = employeeService.getEmployeeById(employee_id);
			existingEmployee.setEmployee_name(employee.getEmployee_name());
			existingEmployee.setEmail(employee.getEmail());
			// save updated employee object
			employeeService.updateEmployee(existingEmployee);
			return "redirect:/employee";
		}
	}
}







