package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "INTERVENTION_CODE", schema = "dbo", catalog = "Inolusion")
public class InterventionCodeEntity {
    private int interventionCodeId;
    private String name;

    @Id
    @Column(name = "INTERVENTION_CODE_ID")
    public int getInterventionCodeId() {
        return interventionCodeId;
    }

    public void setInterventionCodeId(int interventionCodeId) {
        this.interventionCodeId = interventionCodeId;
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
        InterventionCodeEntity that = (InterventionCodeEntity) o;
        return interventionCodeId == that.interventionCodeId &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interventionCodeId, name);
    }
}
