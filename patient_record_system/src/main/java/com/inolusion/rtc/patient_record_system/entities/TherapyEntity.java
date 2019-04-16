package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "THERAPY", schema = "dbo", catalog = "localspringbootdb")
public class TherapyEntity {
    private int therapyId;
    private PatientEntity patientId;
    private String objectiveGoals;
    private String objectiveStatement;
    private String assessmentTreatmentActivity;
    private String assessmentTreatment;
    private AssessmentEntity assessmentProgressId;
    private Date date;
    private LocalTime timeIn;
    private LocalTime timeOut;
    private TherapyStatusEntity therapyStatusId;
    private DischargeEntity dischargeId;
    private String therapistSignature;
    private TherapistEntity therapistId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "THERAPY_ID")
    public int getTherapyId() {
        return therapyId;
    }

    public void setTherapyId(int therapyId) {
        this.therapyId = therapyId;
    }

    @ManyToOne
    @JoinColumn(name = "PATIENT_ID")
    public PatientEntity getPatientId() {
        return patientId;
    }

    public void setPatientId(PatientEntity patientId) {
        this.patientId = patientId;
    }

    @Basic
    @Column(name = "OBJECTIVE_GOALS")
    public String getObjectiveGoals(){return objectiveGoals;}

    public void setObjectiveGoals(String objectiveGoals) {
        this.objectiveGoals = objectiveGoals;
    }

    @Basic
    @Column(name = "OBJECTIVE_STATEMENT")
    public String getObjectiveStatement(){return objectiveStatement;}

    public void setObjectiveStatement(String objectiveStatement) {
        this.objectiveStatement = objectiveStatement;
    }

    @Basic
    @Column(name = "ASSESSMENT_TREATMENT_ACTIVITY")
    public String getAssessmentTreatmentActivity(){return assessmentTreatmentActivity;}

    public void setAssessmentTreatmentActivity(String assessmentTreatmentActivity) {
        this.assessmentTreatmentActivity = assessmentTreatmentActivity;
    }

    @Basic
    @Column(name = "ASSESSMENT_TREATMENT")
    public String getAssessmentTreatment(){return assessmentTreatment;}

    public void setAssessmentTreatment(String assessmentTreatment) {
        this.assessmentTreatment = assessmentTreatment;
    }
    @ManyToOne
    @JoinColumn(name = "ASSESSMENT_PROGRESS_ID")
    public AssessmentEntity getAssessmentProgressId() {return assessmentProgressId;}

    public void setAssessmentProgressId(AssessmentEntity assessmentProgressId) {
        this.assessmentProgressId = assessmentProgressId;
    }
    @Basic
    @Column(name = "DATE")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "TIME_IN")
    public LocalTime getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(LocalTime timeIn) {
        this.timeIn = timeIn;
    }

    @Basic
    @Column(name = "TIME_OUT")
    public LocalTime getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(LocalTime timeOut) {
        this.timeOut = timeOut;
    }

    @ManyToOne
    @JoinColumn(name = "THERAPY_STATUS_ID")
    public TherapyStatusEntity getTherapyStatusId() {
        return therapyStatusId;
    }

    public void setTherapyStatusId(TherapyStatusEntity therapyStatusId) {
        this.therapyStatusId = therapyStatusId;
    }

    @ManyToOne
    @JoinColumn(name = "DISCHARGE_ID")
    public DischargeEntity getDischargeId() {
        return dischargeId;
    }

    public void setDischargeId(DischargeEntity dischargeId) {
        this.dischargeId = dischargeId;
    }

    @Basic
    @Column(name = "THERAPIST_SIGNATURE")
    public String getTherapistSignature() {
        return therapistSignature;
    }

    public void setTherapistSignature(String therapistSignature) {
        this.therapistSignature = therapistSignature;
    }

    @ManyToOne
    @JoinColumn(name = "THERAPIST_ID")
    public TherapistEntity getTherapistId() {
        return therapistId;
    }

    public void setTherapistId(TherapistEntity therapistId) {
        this.therapistId = therapistId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TherapyEntity that = (TherapyEntity) o;
        return therapyId == that.therapyId &&
                patientId == that.patientId &&
                assessmentProgressId == that.assessmentProgressId &&
                therapyStatusId == that.therapyStatusId &&
                dischargeId == that.dischargeId &&
                therapistId == that.therapistId &&
                Objects.equals(date, that.date) &&
                Objects.equals(timeIn, that.timeIn) &&
                Objects.equals(timeOut, that.timeOut) &&
                Objects.equals(therapistSignature, that.therapistSignature) &&
                Objects.equals(objectiveGoals, that.objectiveGoals) &&
                Objects.equals(objectiveStatement, that.objectiveStatement) &&
                Objects.equals(assessmentTreatmentActivity, that.assessmentTreatmentActivity) &&
                Objects.equals(assessmentTreatment, that.assessmentTreatment);
    }

    @Override
    public String toString() {
        return Integer.toString(therapyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(therapyId, patientId, objectiveGoals, objectiveStatement,assessmentTreatmentActivity,assessmentTreatment,assessmentProgressId, date, timeIn, timeOut, therapyStatusId, dischargeId, therapistSignature, therapistId);
    }
}
