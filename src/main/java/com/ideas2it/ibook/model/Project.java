package com.ideas2it.ibook.model;

import java.util.Date;
import java.util.Set;

public class Project {

    private int id;
    private String name;
    private Date startDate;
    private Date endDate;
    private String description;
    private Set<ProjectDetail> projectDetails;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getDescription() {
        return description;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Set<ProjectDetail> getProjectDetails() {
        return projectDetails;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setProjectDetails(Set<ProjectDetail> projectDetails) {
        this.projectDetails = projectDetails;
    }
}