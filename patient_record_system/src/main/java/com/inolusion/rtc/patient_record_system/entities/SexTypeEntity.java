package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SEX_TYPE", schema = "dbo", catalog = "LaptopDB")
public class SexTypeEntity {
    private int sexTypeId;
    private String sex;

    @Id
    @Column(name = "SEX_TYPE_ID")
    public int getSexTypeId() {
        return sexTypeId;
    }

    public void setSexTypeId(int sexTypeId) {
        this.sexTypeId = sexTypeId;
    }

    @Basic
    @Column(name = "SEX")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SexTypeEntity that = (SexTypeEntity) o;
        return sexTypeId == that.sexTypeId &&
                Objects.equals(sex, that.sex);
    }

    @Override
    public String toString() {
        return sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sexTypeId, sex);
    }
}
