package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CODE_FOR_PLAN", schema = "dbo", catalog = "localspringbootdb")
public class CodeForPlanEntity {
    private int codeForPlanId;
    private int planId;
    private int planCodeId;

    @Id
    @Column(name = "CODE_FOR_PLAN_ID")
    public int getCodeForPlanId() {
        return codeForPlanId;
    }

    public void setCodeForPlanId(int codeForPlanId) {
        this.codeForPlanId = codeForPlanId;
    }

    @Basic
    @Column(name = "PLAN_ID")
    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
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
        CodeForPlanEntity that = (CodeForPlanEntity) o;
        return codeForPlanId == that.codeForPlanId &&
                planId == that.planId &&
                planCodeId == that.planCodeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeForPlanId, planId, planCodeId);
    }
}
