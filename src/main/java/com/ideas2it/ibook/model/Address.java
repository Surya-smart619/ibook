package com.ideas2it.ibook.model;

public class Address{

    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id")
    @Id
    private String id;

    @ManyToOne(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Employee employee;
    private String doorNumber;
    private String street;
    private String area;
    private String city;
    private String state;
    private int pincode;
    private String country;

    public Address() {}

    /**
     * Getters and Setters
     */
    public String getId() {
        return this.id;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public String getDoorNumber() {
        return this.doorNumber;
    }

    public String getStreet() {
        return this.street;
    }

    public String getArea() {
        return this.area;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public int getPincode() {
        return this.pincode;
    }

    public String getCountry() {
        return this.country;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public void setCountry(String Country) {
        this.country = country;
    }
}

