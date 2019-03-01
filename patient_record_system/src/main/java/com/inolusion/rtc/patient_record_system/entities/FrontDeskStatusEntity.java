package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "front_desk_status", schema = "dbo", catalog = "Inolusion_PRS")
public class FrontDeskStatusEntity {
    private int frontDeskStatusId;
    private String frontDeskStatusDescription;

    @Id
    @Column(name = "front_desk_status_id")
    public int getFrontDeskStatusId() {
        return frontDeskStatusId;
    }

    public void setFrontDeskStatusId(int frontDeskStatusId) {
        this.frontDeskStatusId = frontDeskStatusId;
    }

    @Basic
    @Column(name = "front_desk_status_description")
    public String getFrontDeskStatusDescription() {
        return frontDeskStatusDescription;
    }

    public void setFrontDeskStatusDescription(String frontDeskStatusDescription) {
        this.frontDeskStatusDescription = frontDeskStatusDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FrontDeskStatusEntity that = (FrontDeskStatusEntity) o;
        return frontDeskStatusId == that.frontDeskStatusId &&
                Objects.equals(frontDeskStatusDescription, that.frontDeskStatusDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frontDeskStatusId, frontDeskStatusDescription);
    }
}
