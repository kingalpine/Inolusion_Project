package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "INCIDENT_TYPE", schema = "dbo", catalog = "LaptopDB")
public class IncidentTypeEntity {
    private int incidentTypeId;
    private String name;

    @Id
    @Column(name = "INCIDENT_TYPE_ID")
    public int getIncidentTypeId() {
        return incidentTypeId;
    }

    public void setIncidentTypeId(int incidentTypeId) {
        this.incidentTypeId = incidentTypeId;
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
        IncidentTypeEntity that = (IncidentTypeEntity) o;
        return incidentTypeId == that.incidentTypeId &&
                Objects.equals(name, that.name);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(incidentTypeId, name);
    }
}
