package com.tao.hrm.domain.employee;

import java.util.Date;

import com.tao.hrm.domain.AbstractDomain;

public class Experience extends AbstractDomain<Long> {
	
	public Experience()
	{
		
	}
	private String company;
	private Date startDate;
	private Date endDate;
	private String position;
	private Double salary;
	private String reasonOfRegsign;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getReasonOfRegsign() {
		return reasonOfRegsign;
	}
	public void setReasonOfRegsign(String reasonOfRegsign) {
		this.reasonOfRegsign = reasonOfRegsign;
	}
}
