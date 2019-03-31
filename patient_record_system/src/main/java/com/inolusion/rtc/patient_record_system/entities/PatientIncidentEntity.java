package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "PATIENT_INCIDENT", schema = "dbo", catalog = "localspringbootdb")
public class PatientIncidentEntity {
    private int patientIncidentId;
    private int patientId;
    private int incidentId;
    private Date date;
    private LocalTime time;

    @Id
    @Column(name = "PATIENT_INCIDENT_ID")
    public int getPatientIncidentId() {
        return patientIncidentId;
    }

    public void setPatientIncidentId(int patientIncidentId) {
        this.patientIncidentId = patientIncidentId;
    }

    @Basic
    @Column(name = "PATIENT_ID")
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
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
        PatientIncidentEntity that = (PatientIncidentEntity) o;
        return patientIncidentId == that.patientIncidentId &&
                patientId == that.patientId &&
                incidentId == that.incidentId &&
                Objects.equals(date, that.date) &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientIncidentId, patientId, incidentId, date, time);
    }
}
