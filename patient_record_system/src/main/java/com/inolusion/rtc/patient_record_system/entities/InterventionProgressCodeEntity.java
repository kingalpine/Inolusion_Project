package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "INTERVENTION_PROGRESS_CODE", schema = "dbo", catalog = "LaptopDB")
public class InterventionProgressCodeEntity {
    private int interventionProgressCodeId;
    private int interventionCodeId;
    private String interventionCodeDesc;
    private int therapyId;

    @Id
    @Column(name = "INTERVENTION_PROGRESS_CODE_ID")
    public int getInterventionProgressCodeId() {
        return interventionProgressCodeId;
    }

    public void setInterventionProgressCodeId(int interventionProgressCodeId) {
        this.interventionProgressCodeId = interventionProgressCodeId;
    }

    @Basic
    @Column(name = "INTERVENTION_CODE_ID")
    public int getInterventionCodeId() {
        return interventionCodeId;
    }

    public void setInterventionCodeId(int interventionCodeId) {
        this.interventionCodeId = interventionCodeId;
    }

    @Basic
    @Column(name = "INTERVENTION_CODE_DESC")
    public String getInterventionCodeDesc() {
        return interventionCodeDesc;
    }

    public void setInterventionCodeDesc(String interventionCodeDesc) {
        this.interventionCodeDesc = interventionCodeDesc;
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
        InterventionProgressCodeEntity that = (InterventionProgressCodeEntity) o;
        return interventionProgressCodeId == that.interventionProgressCodeId &&
                interventionCodeId == that.interventionCodeId &&
                therapyId == that.therapyId &&
                Objects.equals(interventionCodeDesc, that.interventionCodeDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interventionProgressCodeId, interventionCodeId, interventionCodeDesc, therapyId);
    }
}
