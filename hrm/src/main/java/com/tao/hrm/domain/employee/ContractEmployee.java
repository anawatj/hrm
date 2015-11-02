package com.tao.hrm.domain.employee;

import java.util.Date;

public class ContractEmployee extends Employee{

		public ContractEmployee()
		{
			
		}
		private Date startDate;
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
		private Date endDate;
}
