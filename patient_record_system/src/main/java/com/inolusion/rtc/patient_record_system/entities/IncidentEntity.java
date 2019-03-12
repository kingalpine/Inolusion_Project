package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "incident", schema = "dbo", catalog = "localspringbootdb")
public class IncidentEntity {
    private int incidentId;
    private Date incidentDay;

    @Id
    @Column(name = "incident_id")
    public int getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(int incidentId) {
        this.incidentId = incidentId;
    }

    @Basic
    @Column(name = "incident_day")
    public Date getIncidentDay() {
        return incidentDay;
    }

    public void setIncidentDay(Date incidentDay) {
        this.incidentDay = incidentDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IncidentEntity that = (IncidentEntity) o;
        return incidentId == that.incidentId &&
                Objects.equals(incidentDay, that.incidentDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incidentId, incidentDay);
    }
}
