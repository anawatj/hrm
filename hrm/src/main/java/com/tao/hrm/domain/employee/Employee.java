package com.tao.hrm.domain.employee;

import java.util.Set;

import com.tao.hrm.domain.AbstractDomain;
import com.tao.hrm.domain.master.Branch;
import com.tao.hrm.domain.master.Company;
import com.tao.hrm.domain.master.Department;
import com.tao.hrm.domain.master.Position;
import com.tao.hrm.domain.master.Title;

public abstract class Employee extends AbstractDomain<Long> {

	public Employee()
	{
		
	}
	private String employeeCode;
	private Title title;
	private String firstName;
	private String lastName;
	private Company company;
	private Branch branch;
	private Department department;
	private Position position;
	private Double salary;
	private Set<Experience> experiences;
	private Set<Education> educations;

	
	
	public Set<Experience> getExperiences() {
		return experiences;
	}
	public void setExperiences(Set<Experience> experiences) {
		this.experiences = experiences;
	}
	public Set<Education> getEducations() {
		return educations;
	}
	public void setEducations(Set<Education> educations) {
		this.educations = educations;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
	
	
	
}
