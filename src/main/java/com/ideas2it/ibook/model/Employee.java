package com.ideas2it.ibook.model;

import java.util.Date;
import java.util.Set;

/**
 * 
 *
 * @author Surya S
 * @since 05/09/2019
 */
@Entity
@Table(name= "employee")
public class Employee {
 
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id")
    @Id
    private String id;

    @Column(name = "employee_name")
    private String name;

    @Column(name = "employee_code")
    private String employeeCode;

    @Column(name = "joining_date")
    private Date joiningDate;

    @Column(name = "releaving_date")
    private Date releavingDate;

    @Column(name = "birth_date")
    private Date birthDate;

    @OneToOne
    @JoinColumn(name = "designation_id")
    private Designation designation;

    @Column(name = "personal_email_id")
    private String personalEmailId;

    @Column(name = "official_email_id")
    private String officialEmailId;

    @OneToOne
    @JoinColumn(name = "blood_group_id")
    private BloodGroup bloodGroup;

    @Column(name = "phone_number")
    private long phoneNumber;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Address> addresses;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<ProjectDetail> projectDetail;

    @Column(name = "lateral_experience")
    private int lateralExperience;

    @Column(name = "salary")
    private int salary;

    @Column(name = "hobbies")
    private String hobbies;

    @OneToOne
    @JoinColumn(name = "created_by")
    private Employee createdBy;

    @OneToOne
    @JoinColumn(name = "updated_by")
    private Employee updatedBy;

    @Column(name = "bio")
    private String bio;

    @Column(name = "profile_pic_path")
    private String profilePicPath;

    @OneToOne
    @JoinColumn(name = "user_login_id")
    private UserLogin userLogin;

    @Column(name = "status")
    private boolean status;

    public Employee() {}

    /**
     * Getters and Setters
     */
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmployeeCode() {
        return this.employeeCode;
    }

    public Date getJoiningDate() {
        return this.joiningDate;
    }

    public Date getReleavingDate() {
        return this.releavingDate;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public Designation getDesignation() {
        return this.designation;
    }

    public String getPersonalEmailId() {
        return this.personalEmailId;
    }

    public String getOfficialEmailId() {
        return this.officialEmailId;
    }

    public BloodGroup getBloodGroup() {
        return this.bloodGroup;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public Set<Address> getAddresses() {
        return this.addresses;
    }

    public Set<ProjectDetail> getProjectDetail() {
        return this.projectDetail;
    }

    public int getLateralExperience() {
        return this.lateralExperience;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getHobbies() {
        return this.hobbies;
    }

    public Employee getCreatedBy() {
        return this.createdBy;
    }

    public Employee getUpdatedBy() {
        return this.updatedBy;
    }

    public String getBio() {
        return this.bio;
    }

    public String getProfilePicPath() {
        return this.profilePicPath;
    }

    public UserLogin getUserLogin() {
        return this.userLogin;
    }

    public boolean getStatus() {
        return this.status;
    }


    public void setId(String id) {
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

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public void setPersonalEmailId(String personalEmailId) {
        this.personalEmailId = personalEmailId;
    }

    public void setOfficialEmailId(String officialEmailId) {
        this.officialEmailId = officialEmailId;
    }

    public void setBloodGroup(BloodGroup bloodGroop) {
        this.bloodGroup = bloodGroop;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public void setProjectDetail(Set<ProjectDetail> projectDetail) {
        this.projectDetail = projectDetail;
    }

    public void setLateralExperience(int lateralExperience) {
        this.lateralExperience = lateralExperience;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public void setCreatedBy(Employee createdBy) {
        this.createdBy = createdBy;
    }

    public void setUpdatedBy(Employee updatedBy) {
        this.updatedBy = updatedBy;
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

    public void setStatus(boolean status) {
        this.status = status;
    }
}

