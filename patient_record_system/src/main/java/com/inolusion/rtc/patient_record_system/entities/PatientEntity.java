package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "patient", schema = "dbo", catalog = "localspringbootdb")
public class PatientEntity {
    private int patientId;
    private String patientFname;
    private String patientLname;
    private String patientAddress;
    private String patientEmail;
    private Date patientDob;
    private String patientHphone;
    private String patientMphone;

    @Id
    @Column(name = "patient_id")
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Basic
    @Column(name = "patient_fname")
    public String getPatientFname() {
        return patientFname;
    }

    public void setPatientFname(String patientFname) {
        this.patientFname = patientFname;
    }

    @Basic
    @Column(name = "patient_lname")
    public String getPatientLname() {
        return patientLname;
    }

    public void setPatientLname(String patientLname) {
        this.patientLname = patientLname;
    }

    @Basic
    @Column(name = "patient_address")
    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    @Basic
    @Column(name = "patient_email")
    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    @Basic
    @Column(name = "patient_dob")
    public Date getPatientDob() {
        return patientDob;
    }

    public void setPatientDob(Date patientDob) {
        this.patientDob = patientDob;
    }

    @Basic
    @Column(name = "patient_hphone")
    public String getPatientHphone() {
        return patientHphone;
    }

    public void setPatientHphone(String patientHphone) {
        this.patientHphone = patientHphone;
    }

    @Basic
    @Column(name = "patient_mphone")
    public String getPatientMphone() {
        return patientMphone;
    }

    public void setPatientMphone(String patientMphone) {
        this.patientMphone = patientMphone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientEntity that = (PatientEntity) o;
        return patientId == that.patientId &&
                Objects.equals(patientFname, that.patientFname) &&
                Objects.equals(patientLname, that.patientLname) &&
                Objects.equals(patientAddress, that.patientAddress) &&
                Objects.equals(patientEmail, that.patientEmail) &&
                Objects.equals(patientDob, that.patientDob) &&
                Objects.equals(patientHphone, that.patientHphone) &&
                Objects.equals(patientMphone, that.patientMphone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId, patientFname, patientLname, patientAddress, patientEmail, patientDob, patientHphone, patientMphone);
    }
}
