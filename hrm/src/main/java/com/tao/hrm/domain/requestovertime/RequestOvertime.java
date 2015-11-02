package com.tao.hrm.domain.requestovertime;

import java.util.Date;

import com.tao.hrm.domain.AbstractDomain;
import com.tao.hrm.domain.employee.Employee;

public class RequestOvertime extends AbstractDomain<Long> {
	public RequestOvertime()
	{
		
	}
	private String requestOverTimeCode;
	private Employee requestBy;
	public String getRequestOverTimeCode() {
		return requestOverTimeCode;
	}
	public void setRequestOverTimeCode(String requestOverTimeCode) {
		this.requestOverTimeCode = requestOverTimeCode;
	}
	public Employee getRequestBy() {
		return requestBy;
	}
	public void setRequestBy(Employee requestBy) {
		this.requestBy = requestBy;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public Date getOverTimeDate() {
		return overTimeDate;
	}
	public void setOverTimeDate(Date overTimeDate) {
		this.overTimeDate = overTimeDate;
	}
	public Integer getOverTimeHour() {
		return overTimeHour;
	}
	public void setOverTimeHour(Integer overTimeHour) {
		this.overTimeHour = overTimeHour;
	}
	private Date requestDate;
	private Date overTimeDate;
	private Integer overTimeHour;
}
