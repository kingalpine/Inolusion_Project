package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "INCIDENT_STATUS", schema = "dbo", catalog = "localspringbootdb")
public class IncidentStatusEntity {
    private int incidentStatusId;
    private String statusType;

    @Id
    @Column(name = "INCIDENT_STATUS_ID")
    public int getIncidentStatusId() {
        return incidentStatusId;
    }

    public void setIncidentStatusId(int incidentStatusId) {
        this.incidentStatusId = incidentStatusId;
    }

    @Basic
    @Column(name = "STATUS_TYPE")
    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IncidentStatusEntity that = (IncidentStatusEntity) o;
        return incidentStatusId == that.incidentStatusId &&
                Objects.equals(statusType, that.statusType);
    }

    @Override
    public String toString() {
        return statusType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(incidentStatusId, statusType);
    }
}
