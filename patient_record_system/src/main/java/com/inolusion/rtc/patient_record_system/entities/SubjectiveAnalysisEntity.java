package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SUBJECTIVE_ANALYSIS", schema = "dbo", catalog = "localspringbootdb")
public class SubjectiveAnalysisEntity {
    private int subjectiveAnalysisId;
    private int subjectiveCodeId;
    private String note;
    private int therapyId;

    @Id
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

    @Basic
    @Column(name = "NOTE")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "THERAPY_ID")
    public int getTherapyId() {
        return therapyId;
    }

    public void setTherapyId(int therapyId) {
        this.therapyId = therapyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectiveAnalysisEntity that = (SubjectiveAnalysisEntity) o;
        return subjectiveAnalysisId == that.subjectiveAnalysisId &&
                subjectiveCodeId == that.subjectiveCodeId &&
                therapyId == that.therapyId &&
                Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectiveAnalysisId, subjectiveCodeId, note, therapyId);
    }
}
