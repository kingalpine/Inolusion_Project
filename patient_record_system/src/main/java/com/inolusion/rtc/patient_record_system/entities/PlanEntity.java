package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PLAN", schema = "dbo", catalog = "localspringbootdb")
public class PlanEntity {
    private int planId;
    private String planOtherNote;

    @Id
    @Column(name = "PLAN_ID")
    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    @Basic
    @Column(name = "PLAN_OTHER_NOTE")
    public String getPlanOtherNote() {
        return planOtherNote;
    }

    public void setPlanOtherNote(String planOtherNote) {
        this.planOtherNote = planOtherNote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanEntity that = (PlanEntity) o;
        return planId == that.planId &&
                Objects.equals(planOtherNote, that.planOtherNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planId, planOtherNote);
    }
}
