package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "doctor", schema = "dbo", catalog = "Inolusion_PRS")
public class DoctorEntity {
    private int doctorId;
    private String doctorFname;
    private String doctorLname;
    private String doctorAddress;
    private String doctorEmail;
    private Integer doctorOfficeNum;

    @Id
    @Column(name = "doctor_id")
    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    @Basic
    @Column(name = "doctor_fname")
    public String getDoctorFname() {
        return doctorFname;
    }

    public void setDoctorFname(String doctorFname) {
        this.doctorFname = doctorFname;
    }

    @Basic
    @Column(name = "doctor_lname")
    public String getDoctorLname() {
        return doctorLname;
    }

    public void setDoctorLname(String doctorLname) {
        this.doctorLname = doctorLname;
    }

    @Basic
    @Column(name = "doctor_address")
    public String getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }

    @Basic
    @Column(name = "doctor_email")
    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    @Basic
    @Column(name = "doctor_office_num")
    public Integer getDoctorOfficeNum() {
        return doctorOfficeNum;
    }

    public void setDoctorOfficeNum(Integer doctorOfficeNum) {
        this.doctorOfficeNum = doctorOfficeNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoctorEntity that = (DoctorEntity) o;
        return doctorId == that.doctorId &&
                Objects.equals(doctorFname, that.doctorFname) &&
                Objects.equals(doctorLname, that.doctorLname) &&
                Objects.equals(doctorAddress, that.doctorAddress) &&
                Objects.equals(doctorEmail, that.doctorEmail) &&
                Objects.equals(doctorOfficeNum, that.doctorOfficeNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctorId, doctorFname, doctorLname, doctorAddress, doctorEmail, doctorOfficeNum);
    }
}
