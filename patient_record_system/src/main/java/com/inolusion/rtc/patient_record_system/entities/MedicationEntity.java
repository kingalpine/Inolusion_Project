package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "medication", schema = "dbo", catalog = "Inolusion_PRS")
public class MedicationEntity {
    private int medicationId;
    private String medicationName;

    @Id
    @Column(name = "medication_id")
    public int getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(int medicationId) {
        this.medicationId = medicationId;
    }

    @Basic
    @Column(name = "medication_name")
    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicationEntity that = (MedicationEntity) o;
        return medicationId == that.medicationId &&
                Objects.equals(medicationName, that.medicationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicationId, medicationName);
    }
}
