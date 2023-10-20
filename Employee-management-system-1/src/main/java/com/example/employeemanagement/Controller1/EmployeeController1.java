package com.example.employeemanagement.Controller1;


//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.example.employeemanagement.Repository1.EmployeeRepository1;
import com.example.employeemanagement.Service1.EmployeeService1;
import com.example.employeemanagement.entity1.Employee1;
@Controller
public class EmployeeController1 {
	
	private EmployeeRepository1 employeeRepository;
	
private EmployeeService1 employeeService;
public EmployeeController1(EmployeeService1 employeeService) {
	super();
	this.employeeService = employeeService;
}
//handler method to handle list of students return mode and view
@GetMapping("/employee")
public  String  listEmployee(Model model) {
	model.addAttribute("employees", employeeService.getAllEmployees());
	return "employees";
}
@GetMapping("/employees/new")
public String createEmployeeform( Model model) {
	
	 Employee1 employee=new Employee1();
	 model.addAttribute("employee",employee );
	return "create_employee";
}
//handler method for create data in UI
@PostMapping("/employee")
public String saveEmployee(@ModelAttribute("employee")Employee1 employee) {
	employeeService.saveEmployee(employee);
	 return "redirect:/employees"; 	
}
@GetMapping("/employee/edit/{employee_id}")
public String editEmployeeForm(@PathVariable long employee_id,Model model) {
	 model.addAttribute("employee", employeeService.getEmployeeById(employee_id));
	return "edit_employee";	
}
@PostMapping("/employee/{employee_id}")
public String updateEmployee(@PathVariable long employee_id,
		 @ModelAttribute("employee")Employee1 employee,
		 Model model) {
	return null;
	
	
}	
}