package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "THERAPY", schema = "dbo", catalog = "localspringbootdb")
public class TherapyEntity {
    private int therapyId;
    private PatientEntity patientId;
    private ObjectiveEntity objectiveId;
    private AssessmentEntity assessmentId;
    private Date date;
    private LocalTime timeIn;
    private LocalTime timeOut;
    private TherapistStatusEntity therapyStatusId;
    private DischargeEntity dischargeId;
    private String therapistSignature;
    private TherapistEntity therapistId;

    @Id
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

    @OneToMany
    @JoinColumn(name = "Objective_ID")
    public ObjectiveEntity getObjectiveId() {
        return objectiveId;
    }

    public void setObjectiveId(ObjectiveEntity objectiveId) {
        this.objectiveId = objectiveId;
    }

    @OneToMany
    @JoinColumn(name = "ASSESSMENT_ID")
    public AssessmentEntity getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(AssessmentEntity assessmentId) {
        this.assessmentId = assessmentId;
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
    public TherapistStatusEntity getTherapyStatusId() {
        return therapyStatusId;
    }

    public void setTherapyStatusId(TherapistStatusEntity therapyStatusId) {
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
                objectiveId == that.objectiveId &&
                assessmentId == that.assessmentId &&
                therapyStatusId == that.therapyStatusId &&
                dischargeId == that.dischargeId &&
                therapistId == that.therapistId &&
                Objects.equals(date, that.date) &&
                Objects.equals(timeIn, that.timeIn) &&
                Objects.equals(timeOut, that.timeOut) &&
                Objects.equals(therapistSignature, that.therapistSignature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(therapyId, patientId, objectiveId, assessmentId, date, timeIn, timeOut, therapyStatusId, dischargeId, therapistSignature, therapistId);
    }
}
