package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "INCIDENT", schema = "dbo", catalog = "LaptopDB")
public class IncidentEntity {
    private int incidentId;
    private int typeId;
    private int therapyId;
    private String notes;
    private int statusId;

    @Id
    @Column(name = "INCIDENT_ID")
    public int getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(int incidentId) {
        this.incidentId = incidentId;
    }

    @Basic
    @Column(name = "TYPE_ID")
    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "THERAPY_ID")
    public int getTherapyId() {
        return therapyId;
    }

    public void setTherapyId(int therapyId) {
        this.therapyId = therapyId;
    }

    @Basic
    @Column(name = "NOTES")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "STATUS_ID")
    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IncidentEntity that = (IncidentEntity) o;
        return incidentId == that.incidentId &&
                typeId == that.typeId &&
                therapyId == that.therapyId &&
                statusId == that.statusId &&
                Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incidentId, typeId, therapyId, notes, statusId);
    }
}
