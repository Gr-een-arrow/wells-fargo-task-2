package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.math.BigDecimal;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @ManyToOne
    @JoinColumn(name="advisorId")
    private Advisor advisor;

    @OneToOne(mappedBy = "advisor", cascade = CascadeType.ALL, orphanRemoval = true)
    private Address address;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Date dateOfBirth;

    @Column(nullable = false)
    private Boolean employmentStatus;

    @Column(nullable = false)
    private BigDecimal annualIncome;

    protected Client() {

    }

    public Client(Advisor advisor, String firstName, String lastName, String phone, String email, Date dateOfBirt, Boolean employmentStatus, BigDecimal annualIncome) {
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.dateOfBirth = dateOfBirt;
        this.employmentStatus = employmentStatus;
        this.annualIncome = annualIncome;
    }

    public Long getAdvisorId() {
        return clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(Boolean employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public BigDecimal getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(BigDecimal annualIncome){
        this.annualIncome = annualIncome;
    }
}
