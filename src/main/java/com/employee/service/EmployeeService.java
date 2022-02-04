package com.employee.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.employee.details.Employee;


@Component
@Scope(value = "prototype")
public class EmployeeService {
	

	@Autowired
	EmployeeRepositoryService employeeRepositoryService; 
	
	public List<Employee> getEmployees() {
		
		return employeeRepositoryService.findAll(); // Retrieve Operation
		
	}
	
	
	public void addEmployee(Employee emp) { // Insert Operation
		
		employeeRepositoryService.save(emp); 
		
	}
	
	public Optional<Employee> getEmployeeNameById(int id) { // Retrieve by Id operation
		
		return employeeRepositoryService.findById(id);
		
		
	}
	
	public void removeEmployee(int id) { // Delete by Id operation
		
	employeeRepositoryService.deleteById(id);
 
	}
	
	public void removeAllEmployees() {
		
		employeeRepositoryService.deleteAll();
		
	}

	
}
