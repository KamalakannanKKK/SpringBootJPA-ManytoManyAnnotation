package com.example.ManyToManyAnnotation.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ManyToManyAnnotation.Entity.Employee;
import com.example.ManyToManyAnnotation.Repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;
	
	public Employee addEmp(Employee emp) {
		return this.empRepo.save(emp);
	}
	
	public Employee getById(long id) {
		return this.empRepo.findById(id).get();
	}
}
