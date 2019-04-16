package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "INCIDENT", schema = "dbo", catalog = "LaptopDB")
public class IncidentEntity {
    private int incidentId;
    private IncidentTypeEntity incidentTypeId;
    private TherapyEntity therapyId;
    private IncidentStatusEntity incidentStatusId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INCIDENT_ID")
    public int getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(int incidentId) {
        this.incidentId = incidentId;
    }

    @ManyToOne
    @JoinColumn(name = "INCIDENT_TYPE_ID")
    public IncidentTypeEntity getTypeId() {
        return incidentTypeId;
    }

    public void setTypeId(IncidentTypeEntity incidentTypeId) {
        this.incidentTypeId = incidentTypeId;
    }

    @ManyToOne
    @JoinColumn(name = "THERAPY_ID")
    public TherapyEntity getTherapyId() {
        return therapyId;
    }

    public void setTherapyId(TherapyEntity therapyId) {
        this.therapyId = therapyId;
    }


    @ManyToOne
    @JoinColumn(name = "INCIDENT_STATUS_ID")
    public IncidentStatusEntity getStatusId() {
        return incidentStatusId;
    }

    public void setStatusId(IncidentStatusEntity incidentStatusId) {
        this.incidentStatusId = incidentStatusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IncidentEntity that = (IncidentEntity) o;
        return incidentId == that.incidentId &&
                incidentTypeId== that.incidentTypeId &&
                therapyId == that.therapyId &&
                incidentStatusId == that.incidentStatusId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(incidentId, incidentTypeId, therapyId, incidentStatusId);
    }
}
