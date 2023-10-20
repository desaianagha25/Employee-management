package com.example.employeemanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);

	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
	Employee employee1 = new Employee(101, "Anagha Desai", "desaianagha@gmail.com");
	employeeRepository.save(employee1);

	Employee employee2 = new Employee(102, "Vaishnavi Konnur", "vaishnavi@gmail.com");
		employeeRepository.save(employee2);

		Employee employee3 = new Employee(103, "Ashwini Hombal" , "ashwini@gmail.com");
	employeeRepository.save(employee3);

		Employee employee4 = new Employee(104, "Prajwala Ambakki" , "prajwala@gmail.com");
		employeeRepository.save(employee4);
		

}

}
