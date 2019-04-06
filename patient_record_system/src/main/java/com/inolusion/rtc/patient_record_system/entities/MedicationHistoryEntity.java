package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "MEDICATION_HISTORY", schema = "dbo", catalog = "LaptopDB")
public class MedicationHistoryEntity {
    private int medicationHistoryId;
    private int patientId;
    private Date startDate;
    private int medicationId;
    private String dosage;

    @Id
    @Column(name = "MEDICATION_HISTORY_ID")
    public int getMedicationHistoryId() {
        return medicationHistoryId;
    }

    public void setMedicationHistoryId(int medicationHistoryId) {
        this.medicationHistoryId = medicationHistoryId;
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
    @Column(name = "START_DATE")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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
    @Column(name = "DOSAGE")
    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicationHistoryEntity that = (MedicationHistoryEntity) o;
        return medicationHistoryId == that.medicationHistoryId &&
                patientId == that.patientId &&
                medicationId == that.medicationId &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(dosage, that.dosage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicationHistoryId, patientId, startDate, medicationId, dosage);
    }
}
