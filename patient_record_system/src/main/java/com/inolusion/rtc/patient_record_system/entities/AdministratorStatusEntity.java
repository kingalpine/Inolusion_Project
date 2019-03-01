package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "administrator_status", schema = "dbo", catalog = "Inolusion_PRS")
public class AdministratorStatusEntity {
    private int administratorStatusId;
    private String administratorStatusDesc;

    @Id
    @Column(name = "administrator_status_id")
    public int getAdministratorStatusId() {
        return administratorStatusId;
    }

    public void setAdministratorStatusId(int administratorStatusId) {
        this.administratorStatusId = administratorStatusId;
    }

    @Basic
    @Column(name = "administrator_status_desc")
    public String getAdministratorStatusDesc() {
        return administratorStatusDesc;
    }

    public void setAdministratorStatusDesc(String administratorStatusDesc) {
        this.administratorStatusDesc = administratorStatusDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdministratorStatusEntity that = (AdministratorStatusEntity) o;
        return administratorStatusId == that.administratorStatusId &&
                Objects.equals(administratorStatusDesc, that.administratorStatusDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(administratorStatusId, administratorStatusDesc);
    }
}
