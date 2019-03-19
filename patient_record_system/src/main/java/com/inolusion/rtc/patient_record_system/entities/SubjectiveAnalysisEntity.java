package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SUBJECTIVE_ANALYSIS", schema = "dbo", catalog = "localspringbootdb")
public class SubjectiveAnalysisEntity {
    private int subjectiveAnalysisId;
    private boolean subjectiveAnalysisChoices;

    @Id
    @Column(name = "SUBJECTIVE_ANALYSIS_ID")
    public int getSubjectiveAnalysisId() {
        return subjectiveAnalysisId;
    }

    public void setSubjectiveAnalysisId(int subjectiveAnalysisId) {
        this.subjectiveAnalysisId = subjectiveAnalysisId;
    }

    @Basic
    @Column(name = "Subjective_Analysis_Choices")
    public boolean isSubjectiveAnalysisChoices() {
        return subjectiveAnalysisChoices;
    }

    public void setSubjectiveAnalysisChoices(boolean subjectiveAnalysisChoices) {
        this.subjectiveAnalysisChoices = subjectiveAnalysisChoices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectiveAnalysisEntity that = (SubjectiveAnalysisEntity) o;
        return subjectiveAnalysisId == that.subjectiveAnalysisId &&
                subjectiveAnalysisChoices == that.subjectiveAnalysisChoices;
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectiveAnalysisId, subjectiveAnalysisChoices);
    }
}
