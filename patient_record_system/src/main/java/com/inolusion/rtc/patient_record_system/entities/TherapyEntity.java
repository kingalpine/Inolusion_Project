package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "THERAPY", schema = "dbo", catalog = "localspringbootdb")
public class TherapyEntity {
    private int therapyId;
    private int patientId;
    private int objectiveId;
    private int assessmentId;
    private Date date;
    private LocalTime timeIn;
    private LocalTime timeOut;
    private int therapyStatusId;
    private int dischargeId;
    private String therapistSignature;
    private int therapistId;

    @Id
    @Column(name = "THERAPY_ID")
    public int getTherapyId() {
        return therapyId;
    }

    public void setTherapyId(int therapyId) {
        this.therapyId = therapyId;
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

    @Basic
    @Column(name = "THERAPY_STATUS_ID")
    public int getTherapyStatusId() {
        return therapyStatusId;
    }

    public void setTherapyStatusId(int therapyStatusId) {
        this.therapyStatusId = therapyStatusId;
    }

    @Basic
    @Column(name = "DISCHARGE_ID")
    public int getDischargeId() {
        return dischargeId;
    }

    public void setDischargeId(int dischargeId) {
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

    @Basic
    @Column(name = "THERAPIST_ID")
    public int getTherapistId() {
        return therapistId;
    }

    public void setTherapistId(int therapistId) {
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
