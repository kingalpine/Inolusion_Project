package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "plan", schema = "dbo", catalog = "Inolusion_PRS")
public class PlanEntity {
    private int planId;
    private String planOption;
    private String planOther;

    @Id
    @Column(name = "plan_id")
    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    @Basic
    @Column(name = "plan_option")
    public String getPlanOption() {
        return planOption;
    }

    public void setPlanOption(String planOption) {
        this.planOption = planOption;
    }

    @Basic
    @Column(name = "plan_other")
    public String getPlanOther() {
        return planOther;
    }

    public void setPlanOther(String planOther) {
        this.planOther = planOther;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanEntity that = (PlanEntity) o;
        return planId == that.planId &&
                Objects.equals(planOption, that.planOption) &&
                Objects.equals(planOther, that.planOther);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planId, planOption, planOther);
    }
}
