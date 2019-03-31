package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "THERAPY_MEDICATION", schema = "dbo", catalog = "localspringbootdb")
public class TherapyMedicationEntity {
    private int therapyMedicationId;
    private int medicationId;
    private Date startDate;
    private int therapyId;

    @Id
    @Column(name = "THERAPY_MEDICATION_ID")
    public int getTherapyMedicationId() {
        return therapyMedicationId;
    }

    public void setTherapyMedicationId(int therapyMedicationId) {
        this.therapyMedicationId = therapyMedicationId;
    }

    @Basic
    @Column(name = "MEDICATION_ID")
    public int getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(int medicationId) {
        this.medicationId = medicationId;
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
    @Column(name = "THERAPY_ID")
    public int getTherapyId() {
        return therapyId;
    }

    public void setTherapyId(int therapyId) {
        this.therapyId = therapyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TherapyMedicationEntity that = (TherapyMedicationEntity) o;
        return therapyMedicationId == that.therapyMedicationId &&
                medicationId == that.medicationId &&
                therapyId == that.therapyId &&
                Objects.equals(startDate, that.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(therapyMedicationId, medicationId, startDate, therapyId);
    }
}