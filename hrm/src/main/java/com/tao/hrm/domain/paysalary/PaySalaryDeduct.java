package com.tao.hrm.domain.paysalary;

import com.tao.hrm.domain.AbstractDomain;
import com.tao.hrm.domain.master.Deduct;

public class PaySalaryDeduct extends AbstractDomain<Long> {
	

	private Long paySalaryId;
	private Deduct deduct;
	public Long getPaySalaryId() {
		return paySalaryId;
	}
	public void setPaySalaryId(Long paySalaryId) {
		this.paySalaryId = paySalaryId;
	}
	public Deduct getDeduct() {
		return deduct;
	}
	public void setDeduct(Deduct deduct) {
		this.deduct = deduct;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	private Double amount;
}
