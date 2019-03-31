package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PLAN", schema = "dbo", catalog = "localspringbootdb")
public class PlanEntity {
    private int planId;
    private int therapyId;
    private String note;
    private int planCodeId;

    @Id
    @Column(name = "PLAN_ID")
    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    @Basic
    @Column(name = "THERAPY_ID")
    public int getTherapyId() {
        return therapyId;
    }

    public void setTherapyId(int therapyId) {
        this.therapyId = therapyId;
    }

    @Basic
    @Column(name = "NOTE")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "PLAN_CODE_ID")
    public int getPlanCodeId() {
        return planCodeId;
    }

    public void setPlanCodeId(int planCodeId) {
        this.planCodeId = planCodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanEntity that = (PlanEntity) o;
        return planId == that.planId &&
                therapyId == that.therapyId &&
                planCodeId == that.planCodeId &&
                Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planId, therapyId, note, planCodeId);
    }
}
