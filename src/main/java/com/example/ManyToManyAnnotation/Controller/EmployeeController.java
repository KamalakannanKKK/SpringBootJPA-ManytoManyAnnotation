package com.example.ManyToManyAnnotation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ManyToManyAnnotation.Entity.Employee;
import com.example.ManyToManyAnnotation.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;
	
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee emp) {
		return this.empservice.addEmp(emp);
	}
	
	@GetMapping("/get/{id}")
	public Employee getById(@PathVariable long id) {
		return this.empservice.getById(id);
	}
}
