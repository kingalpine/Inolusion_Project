package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "allergy", schema = "dbo", catalog = "localspringbootdb")
public class AllergyEntity {
    private int allergyId;
    private String allergyName;
    private String allergyDesc;

    @Id
    @Column(name = "allergy_id")
    public int getAllergyId() {
        return allergyId;
    }

    public void setAllergyId(int allergyId) {
        this.allergyId = allergyId;
    }

    @Basic
    @Column(name = "allergy_name")
    public String getAllergyName() {
        return allergyName;
    }

    public void setAllergyName(String allergyName) {
        this.allergyName = allergyName;
    }

    @Basic
    @Column(name = "allergy_desc")
    public String getAllergyDesc() {
        return allergyDesc;
    }

    public void setAllergyDesc(String allergyDesc) {
        this.allergyDesc = allergyDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllergyEntity that = (AllergyEntity) o;
        return allergyId == that.allergyId &&
                Objects.equals(allergyName, that.allergyName) &&
                Objects.equals(allergyDesc, that.allergyDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allergyId, allergyName, allergyDesc);
    }
}
