package com.ideas2it.ibook.model;

/**
 * 
 *
 * @author Surya S
 * @since 05/09/2019
 */
@Entity
@Table(name= "role")
public class Role {

    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id")
    @Id
    private String id;

    @Column(name = "name")
    private String name;

    public Role() {}

    /**
     * Getters and Setters
     */
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void getName(String name) {
        this.name = name;
    }
}

