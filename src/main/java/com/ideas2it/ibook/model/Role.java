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
public class Role {

    private int id;

    private String name;

    private UserLogin userLogin;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }
}

