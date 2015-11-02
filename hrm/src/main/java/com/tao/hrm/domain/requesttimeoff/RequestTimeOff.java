package com.tao.hrm.domain.requesttimeoff;

import java.util.Date;

import com.tao.hrm.domain.AbstractDomain;
import com.tao.hrm.domain.employee.Employee;
import com.tao.hrm.domain.master.RequestTimeOffType;

public class RequestTimeOff extends AbstractDomain<Long> {
	
	public RequestTimeOff()
	{
		
	}
	private String requestTimeOffCode;
	private Date requestTimeOffDate;
	private Date startDate;
	private String startTime;
	private Date endDate;
	private String endTime;
	private RequestTimeOffType requestTimeOffType;
	private String reason;
	private RequestTimeOffStatus status;
	private Employee requestBy;
	private Employee approveBy;
	private Date approveDate;
	public String getRequestTimeOffCode() {
		return requestTimeOffCode;
	}
	public void setRequestTimeOffCode(String requestTimeOffCode) {
		this.requestTimeOffCode = requestTimeOffCode;
	}
	public Date getRequestTimeOffDate() {
		return requestTimeOffDate;
	}
	public void setRequestTimeOffDate(Date requestTimeOffDate) {
		this.requestTimeOffDate = requestTimeOffDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public RequestTimeOffType getRequestTimeOffType() {
		return requestTimeOffType;
	}
	public void setRequestTimeOffType(RequestTimeOffType requestTimeOffType) {
		this.requestTimeOffType = requestTimeOffType;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public RequestTimeOffStatus getStatus() {
		return status;
	}
	public void setStatus(RequestTimeOffStatus status) {
		this.status = status;
	}
	public Employee getRequestBy() {
		return requestBy;
	}
	public void setRequestBy(Employee requestBy) {
		this.requestBy = requestBy;
	}
	public Employee getApproveBy() {
		return approveBy;
	}
	public void setApproveBy(Employee approveBy) {
		this.approveBy = approveBy;
	}
	public Date getApproveDate() {
		return approveDate;
	}
	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}
	
}
