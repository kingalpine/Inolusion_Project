package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PATIENT_ALLERGY", schema = "dbo", catalog = "localspringbootdb")
public class PatientAllergyEntity {
    private int patientAllergyId;
    private int patientId;
    private int allergyId;

    @Id
    @Column(name = "PATIENT_ALLERGY_ID")
    public int getPatientAllergyId() {
        return patientAllergyId;
    }

    public void setPatientAllergyId(int patientAllergyId) {
        this.patientAllergyId = patientAllergyId;
    }

    @Basic
    @Column(name = "PATIENT_ID")
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Basic
    @Column(name = "ALLERGY_ID")
    public int getAllergyId() {
        return allergyId;
    }

    public void setAllergyId(int allergyId) {
        this.allergyId = allergyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientAllergyEntity that = (PatientAllergyEntity) o;
        return patientAllergyId == that.patientAllergyId &&
                patientId == that.patientId &&
                allergyId == that.allergyId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientAllergyId, patientId, allergyId);
    }
}
