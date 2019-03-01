package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "patient_status", schema = "dbo", catalog = "Inolusion_PRS")
public class PatientStatusEntity {
    private int patientStatusId;
    private String patientStatusDesc;

    @Id
    @Column(name = "patient_status_id")
    public int getPatientStatusId() {
        return patientStatusId;
    }

    public void setPatientStatusId(int patientStatusId) {
        this.patientStatusId = patientStatusId;
    }

    @Basic
    @Column(name = "patient_status_desc")
    public String getPatientStatusDesc() {
        return patientStatusDesc;
    }

    public void setPatientStatusDesc(String patientStatusDesc) {
        this.patientStatusDesc = patientStatusDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientStatusEntity that = (PatientStatusEntity) o;
        return patientStatusId == that.patientStatusId &&
                Objects.equals(patientStatusDesc, that.patientStatusDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientStatusId, patientStatusDesc);
    }
}
