package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "doctor_status", schema = "dbo", catalog = "Inolusion_PRS")
public class DoctorStatusEntity {
    private int doctorStatusId;
    private String doctorStatusDesc;

    @Id
    @Column(name = "doctor_status_id")
    public int getDoctorStatusId() {
        return doctorStatusId;
    }

    public void setDoctorStatusId(int doctorStatusId) {
        this.doctorStatusId = doctorStatusId;
    }

    @Basic
    @Column(name = "doctor_status_desc")
    public String getDoctorStatusDesc() {
        return doctorStatusDesc;
    }

    public void setDoctorStatusDesc(String doctorStatusDesc) {
        this.doctorStatusDesc = doctorStatusDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoctorStatusEntity that = (DoctorStatusEntity) o;
        return doctorStatusId == that.doctorStatusId &&
                Objects.equals(doctorStatusDesc, that.doctorStatusDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctorStatusId, doctorStatusDesc);
    }
}
