package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "incident_status", schema = "dbo", catalog = "localspringbootdb")
public class IncidentStatusEntity {
    private int incidentStatusId;
    private String incidentStatusDesc;

    @Id
    @Column(name = "incident_status_id")
    public int getIncidentStatusId() {
        return incidentStatusId;
    }

    public void setIncidentStatusId(int incidentStatusId) {
        this.incidentStatusId = incidentStatusId;
    }

    @Basic
    @Column(name = "incident_status_desc")
    public String getIncidentStatusDesc() {
        return incidentStatusDesc;
    }

    public void setIncidentStatusDesc(String incidentStatusDesc) {
        this.incidentStatusDesc = incidentStatusDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IncidentStatusEntity that = (IncidentStatusEntity) o;
        return incidentStatusId == that.incidentStatusId &&
                Objects.equals(incidentStatusDesc, that.incidentStatusDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incidentStatusId, incidentStatusDesc);
    }
}
