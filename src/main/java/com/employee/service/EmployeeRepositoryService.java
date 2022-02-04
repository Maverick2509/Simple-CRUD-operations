package com.employee.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.employee.details.Employee;

@Component
public interface EmployeeRepositoryService extends JpaRepository<Employee, Integer>{

}
