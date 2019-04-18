package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "THERAPIST", schema = "dbo", catalog = "Inolusion")
public class TherapistEntity {
    private int therapistId;
    private String firstName;
    private String lastName;
    private String email;
    private Date startDate;
    private String primaryPhone;
    private String secondaryPhone;
    private TherapistStatusEntity statusId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Column(name = "PRIMARY_PHONE")
    public String getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(String primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    @Basic
    @Column(name = "SECONDARY_PHONE")
    public String getSecondaryPhone() {
        return secondaryPhone;
    }

    public void setSecondaryPhone(String secondaryPhone) {
        this.secondaryPhone = secondaryPhone;
    }

    @ManyToOne
    @JoinColumn(name = "THERAPIST_STATUS_ID")
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
                Objects.equals(primaryPhone, that.primaryPhone) &&
                Objects.equals(secondaryPhone, that.secondaryPhone);
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(therapistId, firstName, lastName, email, startDate, primaryPhone, secondaryPhone, statusId);
    }
}
