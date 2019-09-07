package com.ideas2it.ibook.model;

import java.util.Date;
import java.util.Set;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*; //TODO
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.JoinTable;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

import com.ideas2it.ibook.model.UserLogin;

/**
 * 
 *
 * @author Surya S
 * @since 05/09/2019
 */
public class Employee {
    
    private int id;

    private String name;

    private String employeeCode;

    private Date joiningDate;

    private Date releavingDate;

    private Date birthDate;

    private String personalEmailId;

    private String officialEmailId;

    private String phoneNumber;

    private Integer lateralExperience;

    private Integer salary;

    private String hobbies;

    private String bio;

    private String profilePicPath;

    private UserLogin userLogin;

    private Boolean status;

//getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public Date getReleavingDate() {
        return releavingDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getPersonalEmailId() {
        return personalEmailId;
    }

    public String getOfficialEmailId() {
        return officialEmailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getLateralExperience() {
        return lateralExperience;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getBio() {
        return bio;
    }

    public String getProfilePicPath() {
        return profilePicPath;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public Boolean getStatus() {
        return status;
    }

//setter
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void setReleavingDate(Date releavingDate) {
        this.releavingDate = releavingDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setPersonalEmailId(String personalEmailId) {
        this.personalEmailId = personalEmailId;
    }

    public void setOfficialEmailId(String officialEmailId) {
        this.officialEmailId = officialEmailId;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLateralExperience(Integer lateralExperience) {
        this.lateralExperience = lateralExperience;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setProfilePicPath(String profilePicPath) {
        this.profilePicPath = profilePicPath;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}

