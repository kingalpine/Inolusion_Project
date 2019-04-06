package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ASSESSMENT", schema = "dbo", catalog = "LaptopDB")
public class AssessmentEntity {
    private int assessmentId;
    private String treatmentActivity;
    private String treatmentAssesment;

    @Id
    @Column(name = "ASSESSMENT_ID")
    public int getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(int assessmentId) {
        this.assessmentId = assessmentId;
    }

    @Basic
    @Column(name = "TREATMENT_ACTIVITY")
    public String getTreatmentActivity() {
        return treatmentActivity;
    }

    public void setTreatmentActivity(String treatmentActivity) {
        this.treatmentActivity = treatmentActivity;
    }

    @Basic
    @Column(name = "TREATMENT_ASSESMENT")
    public String getTreatmentAssesment() {
        return treatmentAssesment;
    }

    public void setTreatmentAssesment(String treatmentAssesment) {
        this.treatmentAssesment = treatmentAssesment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssessmentEntity that = (AssessmentEntity) o;
        return assessmentId == that.assessmentId &&
                Objects.equals(treatmentActivity, that.treatmentActivity) &&
                Objects.equals(treatmentAssesment, that.treatmentAssesment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assessmentId, treatmentActivity, treatmentAssesment);
    }
}
