package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PLAN_CODE", schema = "dbo", catalog = "LaptopDB")
public class PlanCodeEntity {
    private int planCodeId;
    private String name;

    @Id
    @Column(name = "PLAN_CODE_ID")
    public int getPlanCodeId() {
        return planCodeId;
    }

    public void setPlanCodeId(int planCodeId) {
        this.planCodeId = planCodeId;
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
        PlanCodeEntity that = (PlanCodeEntity) o;
        return planCodeId == that.planCodeId &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planCodeId, name);
    }
}
