package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DISCHARGE", schema = "dbo", catalog = "localspringbootdb")
public class DischargeEntity {
    private int dischargeId;
    private String dischargePlan;

    @Id
    @Column(name = "DISCHARGE_ID")
    public int getDischargeId() {
        return dischargeId;
    }

    public void setDischargeId(int dischargeId) {
        this.dischargeId = dischargeId;
    }

    @Basic
    @Column(name = "DISCHARGE_PLAN")
    public String getDischargePlan() {
        return dischargePlan;
    }

    public void setDischargePlan(String dischargePlan) {
        this.dischargePlan = dischargePlan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DischargeEntity that = (DischargeEntity) o;
        return dischargeId == that.dischargeId &&
                Objects.equals(dischargePlan, that.dischargePlan);
    }

    @Override
    public String toString() {
        return dischargePlan;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dischargeId, dischargePlan);
    }
}
