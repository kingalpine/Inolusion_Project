package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "THERAPIST_INCIDENT", schema = "dbo", catalog = "localspringbootdb")
public class TherapistIncidentEntity {
    private int therapistIncidentId;
    private int therapistId;
    private int incidentId;

    @Id
    @Column(name = "THERAPIST_INCIDENT_ID")
    public int getTherapistIncidentId() {
        return therapistIncidentId;
    }

    public void setTherapistIncidentId(int therapistIncidentId) {
        this.therapistIncidentId = therapistIncidentId;
    }

    @Basic
    @Column(name = "THERAPIST_ID")
    public int getTherapistId() {
        return therapistId;
    }

    public void setTherapistId(int therapistId) {
        this.therapistId = therapistId;
    }

    @Basic
    @Column(name = "INCIDENT_ID")
    public int getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(int incidentId) {
        this.incidentId = incidentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TherapistIncidentEntity that = (TherapistIncidentEntity) o;
        return therapistIncidentId == that.therapistIncidentId &&
                therapistId == that.therapistId &&
                incidentId == that.incidentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(therapistIncidentId, therapistId, incidentId);
    }
}
