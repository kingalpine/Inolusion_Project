package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "THERAPIST_INCIDENT", schema = "dbo", catalog = "LaptopDB")
public class TherapistIncidentEntity {
    private int therapistIncidentId;
    private int therapistId;
    private int incidentId;
    private Date date;
    private LocalTime time;

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

    @Basic
    @Column(name = "DATE")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "TIME")
    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TherapistIncidentEntity that = (TherapistIncidentEntity) o;
        return therapistIncidentId == that.therapistIncidentId &&
                therapistId == that.therapistId &&
                incidentId == that.incidentId &&
                Objects.equals(date, that.date) &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(therapistIncidentId, therapistId, incidentId, date, time);
    }
}
