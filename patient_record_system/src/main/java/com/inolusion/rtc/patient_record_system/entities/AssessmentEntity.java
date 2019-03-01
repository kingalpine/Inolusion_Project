package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "assessment", schema = "dbo", catalog = "Inolusion_PRS")
public class AssessmentEntity {
    private int assessmentId;
    private String assessmentSummary;

    @Id
    @Column(name = "assessment_id")
    public int getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(int assessmentId) {
        this.assessmentId = assessmentId;
    }

    @Basic
    @Column(name = "assessment_summary")
    public String getAssessmentSummary() {
        return assessmentSummary;
    }

    public void setAssessmentSummary(String assessmentSummary) {
        this.assessmentSummary = assessmentSummary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssessmentEntity that = (AssessmentEntity) o;
        return assessmentId == that.assessmentId &&
                Objects.equals(assessmentSummary, that.assessmentSummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assessmentId, assessmentSummary);
    }
}
