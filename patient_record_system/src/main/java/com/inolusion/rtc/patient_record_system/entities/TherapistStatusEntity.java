package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "therapist_status", schema = "dbo", catalog = "Inolusion_PRS")
public class TherapistStatusEntity {
    private int therapistStatusId;
    private String therapistStatusDesc;

    @Id
    @Column(name = "therapist_status_id")
    public int getTherapistStatusId() {
        return therapistStatusId;
    }

    public void setTherapistStatusId(int therapistStatusId) {
        this.therapistStatusId = therapistStatusId;
    }

    @Basic
    @Column(name = "therapist_status_desc")
    public String getTherapistStatusDesc() {
        return therapistStatusDesc;
    }

    public void setTherapistStatusDesc(String therapistStatusDesc) {
        this.therapistStatusDesc = therapistStatusDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TherapistStatusEntity that = (TherapistStatusEntity) o;
        return therapistStatusId == that.therapistStatusId &&
                Objects.equals(therapistStatusDesc, that.therapistStatusDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(therapistStatusId, therapistStatusDesc);
    }
}
