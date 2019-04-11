package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "PATIENT", schema = "dbo", catalog = "localspringbootdb")
public class PatientEntity {
    private int patientId;
    private String firstName;
    private String lastName;
    private Date startDate;
    private SexTypeEntity sexId;
    private String addressLine;
    private String city;
    private String zipcode;
    private RegionEntity regionId;
    private CountryEntity countryId;
    private String email;
    private Date dob;
    private String homePhone;
    private String mobilePhone;
    private InsuranceEntity insuranceId;
    private PatientStatusEntity statusId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PATIENT_ID")
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Basic
    @NotNull
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

    @Basic
    @Column(name = "START_DATE")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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

    @Basic
    @Column(name = "CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "ZIPCODE")
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
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
    @JoinColumn(name = "INSURANCE_ID")
    public InsuranceEntity getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(InsuranceEntity insuranceId) {
        this.insuranceId = insuranceId;
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
                insuranceId == that.insuranceId &&
                statusId == that.statusId &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(addressLine, that.addressLine) &&
                Objects.equals(city, that.city) &&
                Objects.equals(zipcode, that.zipcode) &&
                Objects.equals(email, that.email) &&
                Objects.equals(dob, that.dob) &&
                Objects.equals(homePhone, that.homePhone) &&
                Objects.equals(mobilePhone, that.mobilePhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId, firstName, lastName, startDate, sexId, addressLine, city, zipcode, regionId, countryId, email, dob, homePhone, mobilePhone, insuranceId, statusId);
    }
}
