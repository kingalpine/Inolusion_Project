package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "THERAPY_SESSION_STATUS", schema = "dbo", catalog = "localspringbootdb")
public class TherapySessionStatusEntity {
    private int therapySessionStatusId;
    private String statusType;

    @Id
    @Column(name = "THERAPY_SESSION_STATUS_ID")
    public int getTherapySessionStatusId() {
        return therapySessionStatusId;
    }

    public void setTherapySessionStatusId(int therapySessionStatusId) {
        this.therapySessionStatusId = therapySessionStatusId;
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
        TherapySessionStatusEntity that = (TherapySessionStatusEntity) o;
        return therapySessionStatusId == that.therapySessionStatusId &&
                Objects.equals(statusType, that.statusType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(therapySessionStatusId, statusType);
    }
}
