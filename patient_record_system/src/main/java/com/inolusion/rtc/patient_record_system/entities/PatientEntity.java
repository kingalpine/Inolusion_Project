package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "patient", schema = "dbo", catalog = "springbootdb")
public class PatientEntity {
    private int patientId;
    private String patientFname;
    private String patientLname;
    private String sex;
    private String patientEmail;
    private Date patientDob;
    private String patientHphone;
    private String patientMphone;
    private Integer height;
    private Integer weight;

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
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    @Basic
    @Column(name = "height")
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Basic
    @Column(name = "weight")
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientEntity that = (PatientEntity) o;
        return patientId == that.patientId &&
                Objects.equals(patientFname, that.patientFname) &&
                Objects.equals(patientLname, that.patientLname) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(patientEmail, that.patientEmail) &&
                Objects.equals(patientDob, that.patientDob) &&
                Objects.equals(patientHphone, that.patientHphone) &&
                Objects.equals(patientMphone, that.patientMphone) &&
                Objects.equals(height, that.height) &&
                Objects.equals(weight, that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId, patientFname, patientLname, sex, patientEmail, patientDob, patientHphone, patientMphone, height, weight);
    }
}
