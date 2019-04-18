package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PATIENT_ALLERGY", schema = "dbo", catalog = "Inolusion")
public class PatientAllergyEntity {
    private int patientAllergyId;
    private int patientId;
    private int allergyId;
    private String allergyDesc;

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

    @Basic
    @Column(name = "ALLERGY_DESC")
    public String getAllergyDesc() {
        return allergyDesc;
    }

    public void setAllergyDesc(String allergyDesc) {
        this.allergyDesc = allergyDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientAllergyEntity that = (PatientAllergyEntity) o;
        return patientAllergyId == that.patientAllergyId &&
                patientId == that.patientId &&
                allergyId == that.allergyId &&
                Objects.equals(allergyDesc, that.allergyDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientAllergyId, patientId, allergyId, allergyDesc);
    }
}
