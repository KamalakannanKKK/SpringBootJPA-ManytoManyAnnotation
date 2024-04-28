package com.example.ManyToManyAnnotation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManyToManyAnnotation.Entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
