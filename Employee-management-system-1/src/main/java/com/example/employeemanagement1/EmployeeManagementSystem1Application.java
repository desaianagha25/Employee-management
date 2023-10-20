package com.example.employeemanagement1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.example.employeemanagement.Repository1.EmployeeRepository1;
import com.example.employeemanagement.entity1.Employee1;

@ComponentScan("com.example.employeemanagement1")
@EntityScan("com.example.employeemanagement.entity1")
@SpringBootApplication
public class EmployeeManagementSystem1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystem1Application.class, args);
	}

	@Autowired
	private EmployeeRepository1 employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		
		Employee1 employee1 = new Employee1(1,"Anagha","Desai","desaianagha@gmail.com");
		employeeRepository.save(employee1);
		
		Employee1 employee2 = new Employee1(1,"Ashwini","Hombal","ashwinih@gmail.com");
		employeeRepository.save(employee2);
		
		Employee1 employee3 = new Employee1(1,"Vaishnavi","Konnur","vaishnavik@gmail.com");
		employeeRepository.save(employee3);
		
		Employee1 employee4 = new Employee1(1,"Dhanya","Kulkarni","dhanya@gmail.com");
		employeeRepository.save(employee4);
		
		Employee1 employee5 = new Employee1(1,"Prajwala","Ambakki","prajwala@gmail.com");
		employeeRepository.save(employee5);
		
	}

}
