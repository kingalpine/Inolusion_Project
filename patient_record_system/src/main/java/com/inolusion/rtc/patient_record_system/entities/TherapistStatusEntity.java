package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "THERAPIST_STATUS", schema = "dbo", catalog = "LaptopDB")
public class TherapistStatusEntity {
    private int therapistStatusId;
    private String statusType;

    @Id
    @Column(name = "THERAPIST_STATUS_ID")
    public int getTherapistStatusId() {
        return therapistStatusId;
    }

    public void setTherapistStatusId(int therapistStatusId) {
        this.therapistStatusId = therapistStatusId;
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
        TherapistStatusEntity that = (TherapistStatusEntity) o;
        return therapistStatusId == that.therapistStatusId &&
                Objects.equals(statusType, that.statusType);
    }

    @Override
    public String toString() {
        return statusType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(therapistStatusId, statusType);
    }
}
