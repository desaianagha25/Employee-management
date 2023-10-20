package com.example.employeemanagement.Repository1;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeemanagement.entity1.Employee1;

@Repository
public interface EmployeeRepository1 extends JpaRepository<Employee1, Long> {
	}


