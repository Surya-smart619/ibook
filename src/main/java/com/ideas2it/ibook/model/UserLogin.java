package com.ideas2it.ibook.model;

/**
 * 
 *
 * @author Surya S
 * @since 05/09/2019
 */
@Entity
@Table(name= "user_login")
public class UserLogin {

    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id")
    @Id
    private String id;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;

    public UserLogin() {}

    /**
     * Getters and Setters
     */
    public String getId() {
        return this.id;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public Role getRole() {
        return this.role;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

