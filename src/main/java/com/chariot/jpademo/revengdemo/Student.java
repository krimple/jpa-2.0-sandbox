package com.chariot.jpademo.revengdemo;
// Generated Aug 12, 2011 5:43:50 PM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * Student generated by hbm2java
 */
@Entity
@Table(name="student"
    ,catalog="coursemgrch4"
)
public class Student  implements java.io.Serializable {


     private long id;
     private Integer version;
     private String addressLine1;
     private String addressLine2;
     private String city;
     private String emailAddress;
     private String firstName;
     private String lastName;
     private String middleNameOrInitial;
     private String postalCode;
     private String stateCode;
     private String dietaryRestrictions;
     private String emergencyContactInfo;
     private String emergencyContactName;
     private Set<Registration> registrations = new HashSet<Registration>(0);

    public Student() {
    }

	
    public Student(long id, String addressLine1, String city, String emailAddress, String lastName, String postalCode, String stateCode, String emergencyContactInfo, String emergencyContactName) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.city = city;
        this.emailAddress = emailAddress;
        this.lastName = lastName;
        this.postalCode = postalCode;
        this.stateCode = stateCode;
        this.emergencyContactInfo = emergencyContactInfo;
        this.emergencyContactName = emergencyContactName;
    }
    public Student(long id, String addressLine1, String addressLine2, String city, String emailAddress, String firstName, String lastName, String middleNameOrInitial, String postalCode, String stateCode, String dietaryRestrictions, String emergencyContactInfo, String emergencyContactName, Set<Registration> registrations) {
       this.id = id;
       this.addressLine1 = addressLine1;
       this.addressLine2 = addressLine2;
       this.city = city;
       this.emailAddress = emailAddress;
       this.firstName = firstName;
       this.lastName = lastName;
       this.middleNameOrInitial = middleNameOrInitial;
       this.postalCode = postalCode;
       this.stateCode = stateCode;
       this.dietaryRestrictions = dietaryRestrictions;
       this.emergencyContactInfo = emergencyContactInfo;
       this.emergencyContactName = emergencyContactName;
       this.registrations = registrations;
    }
   
     @Id 
    
    @Column(name="id", unique=true, nullable=false)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    @Version
    @Column(name="version")
    public Integer getVersion() {
        return this.version;
    }
    
    public void setVersion(Integer version) {
        this.version = version;
    }
    
    @Column(name="address_line1", nullable=false, length=60)
    public String getAddressLine1() {
        return this.addressLine1;
    }
    
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    
    @Column(name="address_line2", length=60)
    public String getAddressLine2() {
        return this.addressLine2;
    }
    
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    
    @Column(name="city", nullable=false, length=40)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    @Column(name="email_address", nullable=false, length=80)
    public String getEmailAddress() {
        return this.emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    @Column(name="first_name", length=30)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    @Column(name="last_name", nullable=false, length=30)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Column(name="middle_name_or_initial", length=30)
    public String getMiddleNameOrInitial() {
        return this.middleNameOrInitial;
    }
    
    public void setMiddleNameOrInitial(String middleNameOrInitial) {
        this.middleNameOrInitial = middleNameOrInitial;
    }
    
    @Column(name="postal_code", nullable=false, length=10)
    public String getPostalCode() {
        return this.postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    @Column(name="state_code", nullable=false, length=2)
    public String getStateCode() {
        return this.stateCode;
    }
    
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }
    
    @Column(name="dietary_restrictions", length=30)
    public String getDietaryRestrictions() {
        return this.dietaryRestrictions;
    }
    
    public void setDietaryRestrictions(String dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }
    
    @Column(name="emergency_contact_info", nullable=false, length=80)
    public String getEmergencyContactInfo() {
        return this.emergencyContactInfo;
    }
    
    public void setEmergencyContactInfo(String emergencyContactInfo) {
        this.emergencyContactInfo = emergencyContactInfo;
    }
    
    @Column(name="emergency_contact_name", nullable=false, length=30)
    public String getEmergencyContactName() {
        return this.emergencyContactName;
    }
    
    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="student")
    public Set<Registration> getRegistrations() {
        return this.registrations;
    }
    
    public void setRegistrations(Set<Registration> registrations) {
        this.registrations = registrations;
    }




}


