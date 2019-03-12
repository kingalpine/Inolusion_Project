package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "therapy_session", schema = "dbo", catalog = "localspringbootdb")
public class TherapySessionEntity {
    private int therapySessionId;
    private Timestamp therapySessionTime;

    @Id
    @Column(name = "therapy_session_id")
    public int getTherapySessionId() {
        return therapySessionId;
    }

    public void setTherapySessionId(int therapySessionId) {
        this.therapySessionId = therapySessionId;
    }

    @Basic
    @Column(name = "therapy_session_time")
    public Timestamp getTherapySessionTime() {
        return therapySessionTime;
    }

    public void setTherapySessionTime(Timestamp therapySessionTime) {
        this.therapySessionTime = therapySessionTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TherapySessionEntity that = (TherapySessionEntity) o;
        return therapySessionId == that.therapySessionId &&
                Objects.equals(therapySessionTime, that.therapySessionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(therapySessionId, therapySessionTime);
    }
}
