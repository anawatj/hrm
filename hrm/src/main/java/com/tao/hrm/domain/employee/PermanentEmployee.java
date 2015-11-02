package com.tao.hrm.domain.employee;

import java.util.Date;

public class PermanentEmployee extends Employee {
	
	public PermanentEmployee()
	{
		
	}
	private Date hiredDate;
	private Date resignDate;
	
	
	public Date getHiredDate() {
		return hiredDate;
	}
	public void setHiredDate(Date hiredDate) {
		this.hiredDate = hiredDate;
	}
	public Date getResignDate() {
		return resignDate;
	}
	public void setResignDate(Date resignDate) {
		this.resignDate = resignDate;
	}
	
}
