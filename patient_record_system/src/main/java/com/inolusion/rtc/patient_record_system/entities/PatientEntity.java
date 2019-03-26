package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "PATIENT", schema = "dbo", catalog = "localspringbootdb")
public class PatientEntity {
    private int patientId;
    private String firstName;
    private String lastName;
    private SexTypeEntity sexId;
    private String addressLine;
    private RegionEntity regionId;
    private CountryEntity countryId;
    private String city;
    private String zip;
    private String email;
    private Date dob;
    private String homePhone;
    private String mobilePhone;
    private PatientStatusEntity statusId;

    @Id
    @Column(name = "PATIENT_ID")
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Basic
    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @ManyToOne
    @JoinColumn(name = "SEX_ID")
    public SexTypeEntity getSexId() {
        return sexId;
    }

    public void setSexId(SexTypeEntity sexId) {
        this.sexId = sexId;
    }

    @Basic
    @Column(name = "ADDRESS_LINE")
    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    @ManyToOne
    @JoinColumn(name = "REGION_ID")
    public RegionEntity getRegionId() {
        return regionId;
    }

    public void setRegionId(RegionEntity regionId) {
        this.regionId = regionId;
    }

    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID")
    public CountryEntity getCountryId() {
        return countryId;
    }

    public void setCountryId(CountryEntity countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "ZIP")
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "DOB")
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Basic
    @Column(name = "HOME_PHONE")
    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    @Basic
    @Column(name = "MOBILE_PHONE")
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @ManyToOne
    @JoinColumn(name = "STATUS_ID")
    public PatientStatusEntity getStatusId() {
        return statusId;
    }

    public void setStatusId(PatientStatusEntity statusId) {
        this.statusId = statusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientEntity that = (PatientEntity) o;
        return patientId == that.patientId &&
                sexId == that.sexId &&
                regionId == that.regionId &&
                countryId == that.countryId &&
                statusId == that.statusId &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(addressLine, that.addressLine) &&
                Objects.equals(city, that.city) &&
                Objects.equals(zip, that.zip) &&
                Objects.equals(email, that.email) &&
                Objects.equals(dob, that.dob) &&
                Objects.equals(homePhone, that.homePhone) &&
                Objects.equals(mobilePhone, that.mobilePhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId, firstName, lastName, sexId, addressLine, regionId, countryId, city, zip, email, dob, homePhone, mobilePhone, statusId);
    }
}
