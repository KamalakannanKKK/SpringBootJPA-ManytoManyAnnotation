package com.example.ManyToManyAnnotation.Entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String employeeName;
	private String designation;
	private String employeeCode;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="employeeProject",
			joinColumns= {@JoinColumn(name="employeeId")},
			inverseJoinColumns= {@JoinColumn(name="projectId")}
			)
	private Set<Project> project;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public Set<Project> getProject() {
		return project;
	}

	public void setProject(Set<Project> project) {
		this.project = project;
	}

	public Employee(long id, String employeeName, String designation, String employeeCode, Set<Project> project) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.designation = designation;
		this.employeeCode = employeeCode;
		this.project = project;
	}

	public Employee() {
		super();
	}
	
	
}
