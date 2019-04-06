package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "MEDICATION", schema = "dbo", catalog = "LaptopDB")
public class MedicationEntity {
    private int medicationId;
    private String name;

    @Id
    @Column(name = "MEDICATION_ID")
    public int getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(int medicationId) {
        this.medicationId = medicationId;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicationEntity that = (MedicationEntity) o;
        return medicationId == that.medicationId &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicationId, name);
    }
}
