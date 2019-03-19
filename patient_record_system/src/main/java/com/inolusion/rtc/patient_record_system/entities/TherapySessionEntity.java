package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "THERAPY_SESSION", schema = "dbo", catalog = "localspringbootdb")
public class TherapySessionEntity {
    private int therapySessionId;
    private int statusId;
    private Date date;
    private Timestamp startTime;
    private Timestamp endTime;

    @Id
    @Column(name = "THERAPY_SESSION_ID")
    public int getTherapySessionId() {
        return therapySessionId;
    }

    public void setTherapySessionId(int therapySessionId) {
        this.therapySessionId = therapySessionId;
    }

    @Basic
    @Column(name = "STATUS_ID")
    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
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
    @Column(name = "START_TIME")
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "END_TIME")
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TherapySessionEntity that = (TherapySessionEntity) o;
        return therapySessionId == that.therapySessionId &&
                statusId == that.statusId &&
                Objects.equals(date, that.date) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(therapySessionId, statusId, date, startTime, endTime);
    }
}
