package com.mindtree.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.restapi.EmployeeServices.EmployeeService;
import com.mindtree.restapi.entity.Employee;

@RestController
public class ApiController {
	@Autowired
	private EmployeeService service;
	
	
	@GetMapping("/employeelist")
	public List<Employee> getEmployeeList(){
		return service.getAllEmployee();
	}

	@PostMapping("/addemployee")
	public void addEmployee(@RequestBody Employee employee) {
		service.addEmployee(employee);
	}
	
	@PutMapping("/updateSalary/{id}/{salary}")
	public Employee updateEmployee(@PathVariable int id,@PathVariable int salary) {
		return service.updateEmployee(id, salary);
	}
	
}
