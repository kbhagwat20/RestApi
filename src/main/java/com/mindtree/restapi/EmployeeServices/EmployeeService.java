package com.mindtree.restapi.EmployeeServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.restapi.entity.Employee;

@Service
public class EmployeeService {
	
	private List<Employee> list;
	
	 public EmployeeService() {
		 list = new ArrayList<>();
		 
		 list.add(new Employee(1,"Krupali", 25000));
		 list.add(new Employee(2,"Mahima", 30000));
		 list.add(new Employee(3,"Pawan", 35000));
		 list.add(new Employee(4,"Rishab", 40000));
		 list.add(new Employee(5,"Shivani", 45000));
		 list.add(new Employee(6,"Raghav", 50000));
		 list.add(new Employee(7,"Akshata", 55000));
		 list.add(new Employee(8,"Bhavesh", 60000));
		 list.add(new Employee(9,"Harshita", 65000));
		 list.add(new Employee(10,"Pradeep", 70000));
		 
		 }
	 
	 public List<Employee> getAllEmployee(){
		 return list;
		 
	 }
	 
	 public void addEmployee(Employee employee) {
		 list.add(employee);
	 }
	
	 public Employee updateEmployee(int id, int salary) {
		 for(Employee e: list) {
			 if(e.getId()== id) {
				 e.setSalary(salary);
				 return e;
			 }
		 }
		return null;
		 
	 }

}
