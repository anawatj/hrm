package com.tao.hrm.domain.paysalary;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.tao.hrm.domain.AbstractDomain;
import com.tao.hrm.domain.employee.Employee;

public class PaySalary extends AbstractDomain<Long>{
	public PaySalary()
	{
		this.incomes= new HashSet<PaySalaryIncome>();
	}
	private String paySalaryCode;
	private Employee employee;
	private Double payAmt;
	private Date payDate;
	private Employee approveBy;
	private Employee approveDate;
	private Set<PaySalaryIncome> incomes;
	public String getPaySalaryCode() {
		return paySalaryCode;
	}
	public void setPaySalaryCode(String paySalaryCode) {
		this.paySalaryCode = paySalaryCode;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Double getPayAmt() {
		return payAmt;
	}
	public void setPayAmt(Double payAmt) {
		this.payAmt = payAmt;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public Employee getApproveBy() {
		return approveBy;
	}
	public void setApproveBy(Employee approveBy) {
		this.approveBy = approveBy;
	}
	public Employee getApproveDate() {
		return approveDate;
	}
	public void setApproveDate(Employee approveDate) {
		this.approveDate = approveDate;
	}
	public Set<PaySalaryIncome> getIncomes() {
		return incomes;
	}
	public void setIncomes(Set<PaySalaryIncome> incomes) {
		this.incomes = incomes;
	}
	public Set<PaySalaryDeduct> getDeducts() {
		return deducts;
	}
	public void setDeducts(Set<PaySalaryDeduct> deducts) {
		this.deducts = deducts;
	}
	private Set<PaySalaryDeduct> deducts;
	

}
