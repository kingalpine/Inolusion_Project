package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PATIENT_STATUS", schema = "dbo", catalog = "LaptopDB")
public class PatientStatusEntity {
    private int patientStatusId;
    private String statusType;

    @Id
    @Column(name = "PATIENT_STATUS_ID")
    public int getPatientStatusId() {
        return patientStatusId;
    }

    public void setPatientStatusId(int patientStatusId) {
        this.patientStatusId = patientStatusId;
    }

    @Basic
    @Column(name = "STATUS_TYPE")
    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientStatusEntity that = (PatientStatusEntity) o;
        return patientStatusId == that.patientStatusId &&
                Objects.equals(statusType, that.statusType);
    }

    @Override
    public String toString() {
        return statusType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientStatusId, statusType);
    }
}
