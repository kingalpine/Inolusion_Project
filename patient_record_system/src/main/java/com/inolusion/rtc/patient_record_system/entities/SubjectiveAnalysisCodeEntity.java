package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SUBJECTIVE_ANALYSIS_CODE", schema = "dbo", catalog = "localspringbootdb")
public class SubjectiveAnalysisCodeEntity {
    private int subjectiveAnalysisCodeId;
    private int subjectiveAnalysisId;
    private int subjectiveCodeId;

    @Id
    @Column(name = "SUBJECTIVE_ANALYSIS_CODE_ID")
    public int getSubjectiveAnalysisCodeId() {
        return subjectiveAnalysisCodeId;
    }

    public void setSubjectiveAnalysisCodeId(int subjectiveAnalysisCodeId) {
        this.subjectiveAnalysisCodeId = subjectiveAnalysisCodeId;
    }

    @Basic
    @Column(name = "SUBJECTIVE_ANALYSIS_ID")
    public int getSubjectiveAnalysisId() {
        return subjectiveAnalysisId;
    }

    public void setSubjectiveAnalysisId(int subjectiveAnalysisId) {
        this.subjectiveAnalysisId = subjectiveAnalysisId;
    }

    @Basic
    @Column(name = "SUBJECTIVE_CODE_ID")
    public int getSubjectiveCodeId() {
        return subjectiveCodeId;
    }

    public void setSubjectiveCodeId(int subjectiveCodeId) {
        this.subjectiveCodeId = subjectiveCodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectiveAnalysisCodeEntity that = (SubjectiveAnalysisCodeEntity) o;
        return subjectiveAnalysisCodeId == that.subjectiveAnalysisCodeId &&
                subjectiveAnalysisId == that.subjectiveAnalysisId &&
                subjectiveCodeId == that.subjectiveCodeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectiveAnalysisCodeId, subjectiveAnalysisId, subjectiveCodeId);
    }
}
