package com.tao.hrm.domain.paysalary;

import com.tao.hrm.domain.AbstractDomain;
import com.tao.hrm.domain.master.Income;

public class PaySalaryIncome extends AbstractDomain<Long> {

		public PaySalaryIncome()
		{
			
		}
		private Long paySalaryId;
		private Income income;
		private Double amount;
		public Long getPaySalaryId() {
			return paySalaryId;
		}
		public void setPaySalaryId(Long paySalaryId) {
			this.paySalaryId = paySalaryId;
		}
		public Income getIncome() {
			return income;
		}
		public void setIncome(Income income) {
			this.income = income;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
}
