package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ALLERGY", schema = "dbo", catalog = "Inolusion")
public class AllergyEntity {
    private int allergyId;
    private String name;

    @Id
    @Column(name = "ALLERGY_ID")
    public int getAllergyId() {
        return allergyId;
    }

    public void setAllergyId(int allergyId) {
        this.allergyId = allergyId;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllergyEntity that = (AllergyEntity) o;
        return allergyId == that.allergyId &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allergyId, name);
    }
}
