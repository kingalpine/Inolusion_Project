package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "incident_type", schema = "dbo", catalog = "Inolusion_PRS")
public class IncidentTypeEntity {
    private int incidentTypeId;
    private String incidentTypeDesc;

    @Id
    @Column(name = "incident_type_id")
    public int getIncidentTypeId() {
        return incidentTypeId;
    }

    public void setIncidentTypeId(int incidentTypeId) {
        this.incidentTypeId = incidentTypeId;
    }

    @Basic
    @Column(name = "incident_type_desc")
    public String getIncidentTypeDesc() {
        return incidentTypeDesc;
    }

    public void setIncidentTypeDesc(String incidentTypeDesc) {
        this.incidentTypeDesc = incidentTypeDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IncidentTypeEntity that = (IncidentTypeEntity) o;
        return incidentTypeId == that.incidentTypeId &&
                Objects.equals(incidentTypeDesc, that.incidentTypeDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incidentTypeId, incidentTypeDesc);
    }
}
