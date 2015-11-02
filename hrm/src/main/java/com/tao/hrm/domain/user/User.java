package com.tao.hrm.domain.user;

import com.tao.hrm.domain.AbstractDomain;
import com.tao.hrm.domain.employee.Employee;

public class User  extends AbstractDomain<Long>{
	
	public User()
	{
		
	}
	private String userCode;
	private String password;
	private Employee employee;
	private boolean isAdmin;
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
}
