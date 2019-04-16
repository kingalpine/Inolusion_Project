package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SUBJECTIVE_CODE", schema = "dbo", catalog = "localspringbootdb")
public class SubjectiveCodeEntity {
    private int subjectiveCodeId;
    private String name;

    @Id
    @Column(name = "SUBJECTIVE_CODE_ID")
    public int getSubjectiveCodeId() {
        return subjectiveCodeId;
    }

    public void setSubjectiveCodeId(int subjectiveCodeId) {
        this.subjectiveCodeId = subjectiveCodeId;
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
        SubjectiveCodeEntity that = (SubjectiveCodeEntity) o;
        return subjectiveCodeId == that.subjectiveCodeId &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectiveCodeId, name);
    }
}
