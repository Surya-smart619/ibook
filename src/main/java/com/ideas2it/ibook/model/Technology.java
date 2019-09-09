package com.ideas2it.ibook.model;

import java.util.Date;

public class Technology {
	private int id;
	private String technology_name;
	private Date startDate;
	private Date endDate;
	private int employee_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTechnology_name() {
		return technology_name;
	}
	public void setTechnology_name(String technology_name) {
		this.technology_name = technology_name;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
