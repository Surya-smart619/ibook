package com.ideas2it.ibook.model;

import java.util.Date;

public class ProjectDetail {
    private int id;
    private Employee employee;
    private Project project;
    private Date startDate;
    private Date endDate;
    private String projectRole;
    private boolean isActive;

    public int getId() {
        return id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Project getProject() {
        return project;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getProjectRole() {
        return projectRole;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setProjectRole(String projectRole) {
        this.projectRole = projectRole;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
