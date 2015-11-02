package com.tao.hrm.domain.employee;

import com.tao.hrm.domain.AbstractDomain;
import com.tao.hrm.domain.master.EducationLevel;

public class Education extends AbstractDomain<Long> {
	public Education()
	{
		
	}
	private EducationLevel educationLevel;
	private String university;
	private String major;
	private String minor;
	private Double gpa;
	public EducationLevel getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(EducationLevel educationLevel) {
		this.educationLevel = educationLevel;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMinor() {
		return minor;
	}
	public void setMinor(String minor) {
		this.minor = minor;
	}
	public Double getGpa() {
		return gpa;
	}
	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
}
