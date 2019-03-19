package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "THERAPY_PROGRESS_NOTE", schema = "dbo", catalog = "localspringbootdb")
public class TherapyProgressNoteEntity {
    private int therapyProgressNoteId;
    private int patientId;
    private int therapySessionId;
    private int subjectiveAnalysisId;
    private int objectiveId;
    private int assessmentId;
    private int planId;
    private int speechCptCodeId;
    private Timestamp timeIn;
    private Timestamp timeOut;
    private String supervisorSignature;
    private String therapistSignature;

    @Id
    @Column(name = "THERAPY_PROGRESS_NOTE_ID")
    public int getTherapyProgressNoteId() {
        return therapyProgressNoteId;
    }

    public void setTherapyProgressNoteId(int therapyProgressNoteId) {
        this.therapyProgressNoteId = therapyProgressNoteId;
    }

    @Basic
    @Column(name = "PATIENT_ID")
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Basic
    @Column(name = "Therapy_Session_ID")
    public int getTherapySessionId() {
        return therapySessionId;
    }

    public void setTherapySessionId(int therapySessionId) {
        this.therapySessionId = therapySessionId;
    }

    @Basic
    @Column(name = "Subjective_Analysis_ID")
    public int getSubjectiveAnalysisId() {
        return subjectiveAnalysisId;
    }

    public void setSubjectiveAnalysisId(int subjectiveAnalysisId) {
        this.subjectiveAnalysisId = subjectiveAnalysisId;
    }

    @Basic
    @Column(name = "Objective_ID")
    public int getObjectiveId() {
        return objectiveId;
    }

    public void setObjectiveId(int objectiveId) {
        this.objectiveId = objectiveId;
    }

    @Basic
    @Column(name = "ASSESSMENT_ID")
    public int getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(int assessmentId) {
        this.assessmentId = assessmentId;
    }

    @Basic
    @Column(name = "PLAN_ID")
    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    @Basic
    @Column(name = "SPEECH_CPT_CODE_ID")
    public int getSpeechCptCodeId() {
        return speechCptCodeId;
    }

    public void setSpeechCptCodeId(int speechCptCodeId) {
        this.speechCptCodeId = speechCptCodeId;
    }

    @Basic
    @Column(name = "TIME_IN")
    public Timestamp getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Timestamp timeIn) {
        this.timeIn = timeIn;
    }

    @Basic
    @Column(name = "TIME_OUT")
    public Timestamp getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Timestamp timeOut) {
        this.timeOut = timeOut;
    }

    @Basic
    @Column(name = "SUPERVISOR_SIGNATURE")
    public String getSupervisorSignature() {
        return supervisorSignature;
    }

    public void setSupervisorSignature(String supervisorSignature) {
        this.supervisorSignature = supervisorSignature;
    }

    @Basic
    @Column(name = "THERAPIST_SIGNATURE")
    public String getTherapistSignature() {
        return therapistSignature;
    }

    public void setTherapistSignature(String therapistSignature) {
        this.therapistSignature = therapistSignature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TherapyProgressNoteEntity that = (TherapyProgressNoteEntity) o;
        return therapyProgressNoteId == that.therapyProgressNoteId &&
                patientId == that.patientId &&
                therapySessionId == that.therapySessionId &&
                subjectiveAnalysisId == that.subjectiveAnalysisId &&
                objectiveId == that.objectiveId &&
                assessmentId == that.assessmentId &&
                planId == that.planId &&
                speechCptCodeId == that.speechCptCodeId &&
                Objects.equals(timeIn, that.timeIn) &&
                Objects.equals(timeOut, that.timeOut) &&
                Objects.equals(supervisorSignature, that.supervisorSignature) &&
                Objects.equals(therapistSignature, that.therapistSignature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(therapyProgressNoteId, patientId, therapySessionId, subjectiveAnalysisId, objectiveId, assessmentId, planId, speechCptCodeId, timeIn, timeOut, supervisorSignature, therapistSignature);
    }
}
