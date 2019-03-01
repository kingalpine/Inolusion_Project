package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "subjective", schema = "dbo", catalog = "Inolusion_PRS")
public class SubjectiveEntity {
    private int subjectiveId;
    private String subjectiveOption;
    private String subjectiveOther;

    @Id
    @Column(name = "subjective_id")
    public int getSubjectiveId() {
        return subjectiveId;
    }

    public void setSubjectiveId(int subjectiveId) {
        this.subjectiveId = subjectiveId;
    }

    @Basic
    @Column(name = "subjective_option")
    public String getSubjectiveOption() {
        return subjectiveOption;
    }

    public void setSubjectiveOption(String subjectiveOption) {
        this.subjectiveOption = subjectiveOption;
    }

    @Basic
    @Column(name = "subjective_other")
    public String getSubjectiveOther() {
        return subjectiveOther;
    }

    public void setSubjectiveOther(String subjectiveOther) {
        this.subjectiveOther = subjectiveOther;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectiveEntity that = (SubjectiveEntity) o;
        return subjectiveId == that.subjectiveId &&
                Objects.equals(subjectiveOption, that.subjectiveOption) &&
                Objects.equals(subjectiveOther, that.subjectiveOther);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectiveId, subjectiveOption, subjectiveOther);
    }
}
