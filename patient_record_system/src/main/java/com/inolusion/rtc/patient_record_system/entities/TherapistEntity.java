package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "therapist", schema = "dbo", catalog = "Inolusion_PRS")
public class TherapistEntity {
    private int therapistId;
    private String therapistFname;
    private String therapistLname;
    private String therapistAddress;
    private String therapistEmail;
    private Date therapistDob;
    private Integer therapistHphone;
    private Integer therapistMphone;

    @Id
    @Column(name = "therapist_id")
    public int getTherapistId() {
        return therapistId;
    }

    public void setTherapistId(int therapistId) {
        this.therapistId = therapistId;
    }

    @Basic
    @Column(name = "therapist_fname")
    public String getTherapistFname() {
        return therapistFname;
    }

    public void setTherapistFname(String therapistFname) {
        this.therapistFname = therapistFname;
    }

    @Basic
    @Column(name = "therapist_lname")
    public String getTherapistLname() {
        return therapistLname;
    }

    public void setTherapistLname(String therapistLname) {
        this.therapistLname = therapistLname;
    }

    @Basic
    @Column(name = "therapist_address")
    public String getTherapistAddress() {
        return therapistAddress;
    }

    public void setTherapistAddress(String therapistAddress) {
        this.therapistAddress = therapistAddress;
    }

    @Basic
    @Column(name = "therapist_email")
    public String getTherapistEmail() {
        return therapistEmail;
    }

    public void setTherapistEmail(String therapistEmail) {
        this.therapistEmail = therapistEmail;
    }

    @Basic
    @Column(name = "therapist_dob")
    public Date getTherapistDob() {
        return therapistDob;
    }

    public void setTherapistDob(Date therapistDob) {
        this.therapistDob = therapistDob;
    }

    @Basic
    @Column(name = "therapist_hphone")
    public Integer getTherapistHphone() {
        return therapistHphone;
    }

    public void setTherapistHphone(Integer therapistHphone) {
        this.therapistHphone = therapistHphone;
    }

    @Basic
    @Column(name = "therapist_mphone")
    public Integer getTherapistMphone() {
        return therapistMphone;
    }

    public void setTherapistMphone(Integer therapistMphone) {
        this.therapistMphone = therapistMphone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TherapistEntity that = (TherapistEntity) o;
        return therapistId == that.therapistId &&
                Objects.equals(therapistFname, that.therapistFname) &&
                Objects.equals(therapistLname, that.therapistLname) &&
                Objects.equals(therapistAddress, that.therapistAddress) &&
                Objects.equals(therapistEmail, that.therapistEmail) &&
                Objects.equals(therapistDob, that.therapistDob) &&
                Objects.equals(therapistHphone, that.therapistHphone) &&
                Objects.equals(therapistMphone, that.therapistMphone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(therapistId, therapistFname, therapistLname, therapistAddress, therapistEmail, therapistDob, therapistHphone, therapistMphone);
    }
}
