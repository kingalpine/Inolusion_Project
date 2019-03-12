package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "referral", schema = "dbo", catalog = "localspringbootdb")
public class ReferralEntity {
    private int referralId;
    private Date referralDate;
    private String patientName;
    private Integer patientAge;
    private String patientParentName;
    private Integer patientPhone;
    private String patientResidence;

    @Id
    @Column(name = "referral_id")
    public int getReferralId() {
        return referralId;
    }

    public void setReferralId(int referralId) {
        this.referralId = referralId;
    }

    @Basic
    @Column(name = "referral_date")
    public Date getReferralDate() {
        return referralDate;
    }

    public void setReferralDate(Date referralDate) {
        this.referralDate = referralDate;
    }

    @Basic
    @Column(name = "patient_name")
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    @Basic
    @Column(name = "patient_age")
    public Integer getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(Integer patientAge) {
        this.patientAge = patientAge;
    }

    @Basic
    @Column(name = "patient_parent_name")
    public String getPatientParentName() {
        return patientParentName;
    }

    public void setPatientParentName(String patientParentName) {
        this.patientParentName = patientParentName;
    }

    @Basic
    @Column(name = "patient_phone")
    public Integer getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(Integer patientPhone) {
        this.patientPhone = patientPhone;
    }

    @Basic
    @Column(name = "patient_residence")
    public String getPatientResidence() {
        return patientResidence;
    }

    public void setPatientResidence(String patientResidence) {
        this.patientResidence = patientResidence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReferralEntity that = (ReferralEntity) o;
        return referralId == that.referralId &&
                Objects.equals(referralDate, that.referralDate) &&
                Objects.equals(patientName, that.patientName) &&
                Objects.equals(patientAge, that.patientAge) &&
                Objects.equals(patientParentName, that.patientParentName) &&
                Objects.equals(patientPhone, that.patientPhone) &&
                Objects.equals(patientResidence, that.patientResidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referralId, referralDate, patientName, patientAge, patientParentName, patientPhone, patientResidence);
    }
}
