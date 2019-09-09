package com.ideas2it.ibook.model;

import java.util.Date;

public class Qualification {
	private int id;
	private int employee_id;
	private String course_name;
	private String institution;
	private Date passed_out_year;
	private float percentage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public Date getPassed_out_year() {
		return passed_out_year;
	}
	public void setPassed_out_year(Date passed_out_year) {
		this.passed_out_year = passed_out_year;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}

}
