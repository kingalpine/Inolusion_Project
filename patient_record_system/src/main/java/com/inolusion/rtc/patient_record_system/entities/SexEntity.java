package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sex", schema = "dbo", catalog = "Inolusion_PRS")
public class SexEntity {
    private int sexId;
    private String sexName;

    @Id
    @Column(name = "sex_id")
    public int getSexId() {
        return sexId;
    }

    public void setSexId(int sexId) {
        this.sexId = sexId;
    }

    @Basic
    @Column(name = "sex_name")
    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SexEntity sexEntity = (SexEntity) o;
        return sexId == sexEntity.sexId &&
                Objects.equals(sexName, sexEntity.sexName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sexId, sexName);
    }
}
