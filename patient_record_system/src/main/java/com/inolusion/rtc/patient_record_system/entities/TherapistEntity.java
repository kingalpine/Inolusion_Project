package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "THERAPIST", schema = "dbo", catalog = "LaptopDB")
public class TherapistEntity {
    private int therapistId;
    private String firstName;
    private String lastName;
    private String email;
    private Date startDate;
    private String homePhone;
    private String mobilePhone;
    private TherapistStatusEntity statusId;

    @Id
    @Column(name = "THERAPIST_ID")
    public int getTherapistId() {
        return therapistId;
    }

    public void setTherapistId(int therapistId) {
        this.therapistId = therapistId;
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

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "START_DATE")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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
    public TherapistStatusEntity getStatusId() {
        return statusId;
    }

    public void setStatusId(TherapistStatusEntity statusId) {
        this.statusId = statusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TherapistEntity that = (TherapistEntity) o;
        return therapistId == that.therapistId &&
                statusId == that.statusId &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(email, that.email) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(homePhone, that.homePhone) &&
                Objects.equals(mobilePhone, that.mobilePhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(therapistId, firstName, lastName, email, startDate, homePhone, mobilePhone, statusId);
    }
}
