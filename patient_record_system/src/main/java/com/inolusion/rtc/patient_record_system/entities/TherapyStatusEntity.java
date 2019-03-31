package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "THERAPY_STATUS", schema = "dbo", catalog = "localspringbootdb")
public class TherapyStatusEntity {
    private int therapyStatusId;
    private String statusType;

    @Id
    @Column(name = "THERAPY_STATUS_ID")
    public int getTherapyStatusId() {
        return therapyStatusId;
    }

    public void setTherapyStatusId(int therapyStatusId) {
        this.therapyStatusId = therapyStatusId;
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
        TherapyStatusEntity that = (TherapyStatusEntity) o;
        return therapyStatusId == that.therapyStatusId &&
                Objects.equals(statusType, that.statusType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(therapyStatusId, statusType);
    }
}
