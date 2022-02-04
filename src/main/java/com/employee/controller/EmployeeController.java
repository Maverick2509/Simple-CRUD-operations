package com.employee.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.employee.details.Employee;
import com.employee.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/list")
	@ResponseBody
	public List<Employee> retrieveEmployeeDetails() {

		return employeeService.getEmployees();
		
	}
	
	
	@GetMapping("/list/{id}")
	@ResponseBody
	public Optional<Employee> retrieveEmployeeDetailsById(@PathVariable int id) {
		
		System.out.println(employeeService.getEmployeeNameById(id));
		return employeeService.getEmployeeNameById(id);
	}
	
	
	
	@PostMapping("/list")
	public ResponseEntity addEmployeeDetails(@RequestBody Employee employee) {
		
		employeeService.addEmployee(employee);
		//employeeService.removeEmployee(2);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/list").build().toUri();
		return ResponseEntity.created(location).build();
		
	}
	
	@DeleteMapping("/list")
	public ResponseEntity<Object> removeAllEmployeesDetails() {
		
		employeeService.removeAllEmployees();
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/list").build().toUri();
		
		return ResponseEntity.accepted().build();		
	}
	
	@DeleteMapping("/list/{id}")
	public ResponseEntity removeEmployeeDetails(@PathVariable int id) {
		
		employeeService.removeEmployee(id);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/list").build().toUri();
		
		return ResponseEntity.accepted().build();
	}
	
	
	@PutMapping("/list")
	public ResponseEntity updateEmployeeDetails(@RequestBody Employee employee) {
		
		employeeService.addEmployee(employee);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/list").build().toUri();
		
		return ResponseEntity.created(location).build();
		
		
	}

}
