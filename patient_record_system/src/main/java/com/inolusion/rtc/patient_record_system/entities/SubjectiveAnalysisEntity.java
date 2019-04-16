package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SUBJECTIVE_ANALYSIS", schema = "dbo", catalog = "LaptopDB")
public class SubjectiveAnalysisEntity {
    private int subjectiveAnalysisId;
    private SubjectiveCodeEntity subjectiveCodeId;
    private String note;
    private TherapyEntity therapyId;

    @Id
    @Column(name = "SUBJECTIVE_ANALYSIS_ID")
    public int getSubjectiveAnalysisId() {
        return subjectiveAnalysisId;
    }

    public void setSubjectiveAnalysisId(int subjectiveAnalysisId) {
        this.subjectiveAnalysisId = subjectiveAnalysisId;
    }

    @ManyToOne
    @JoinColumn(name = "SUBJECTIVE_CODE_ID")
    public SubjectiveCodeEntity getSubjectiveCodeId() {
        return subjectiveCodeId;
    }

    public void setSubjectiveCodeId(SubjectiveCodeEntity subjectiveCodeId) {
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

    @ManyToOne
    @JoinColumn(name = "THERAPY_ID")
    public TherapyEntity getTherapyId() {
        return therapyId;
    }

    public void setTherapyId(TherapyEntity therapyId) {
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
