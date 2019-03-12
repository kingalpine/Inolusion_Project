package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "intervention_code", schema = "dbo", catalog = "localspringbootdb")
public class InterventionCodeEntity {
    private int interventionCodeId;
    private String interventionCodeName;
    private String interventionCodeDesc;

    @Id
    @Column(name = "intervention_code_id")
    public int getInterventionCodeId() {
        return interventionCodeId;
    }

    public void setInterventionCodeId(int interventionCodeId) {
        this.interventionCodeId = interventionCodeId;
    }

    @Basic
    @Column(name = "intervention_code_name")
    public String getInterventionCodeName() {
        return interventionCodeName;
    }

    public void setInterventionCodeName(String interventionCodeName) {
        this.interventionCodeName = interventionCodeName;
    }

    @Basic
    @Column(name = "intervention_code_desc")
    public String getInterventionCodeDesc() {
        return interventionCodeDesc;
    }

    public void setInterventionCodeDesc(String interventionCodeDesc) {
        this.interventionCodeDesc = interventionCodeDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InterventionCodeEntity that = (InterventionCodeEntity) o;
        return interventionCodeId == that.interventionCodeId &&
                Objects.equals(interventionCodeName, that.interventionCodeName) &&
                Objects.equals(interventionCodeDesc, that.interventionCodeDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interventionCodeId, interventionCodeName, interventionCodeDesc);
    }
}
