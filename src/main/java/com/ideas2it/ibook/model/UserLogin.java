package com.ideas2it.ibook.model;

import org.hibernate.annotations.GenericGenerator;

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

import com.ideas2it.ibook.model.Employee;

/**
 * 
 *
 * @author Surya S
 * @since 05/09/2019
 */
public class UserLogin {

    private int id;

    private Employee employee;
    
    private Role role;

    private String password;

    public int getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

