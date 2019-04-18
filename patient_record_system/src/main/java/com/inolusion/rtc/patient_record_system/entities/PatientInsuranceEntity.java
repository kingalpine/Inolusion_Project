package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;
@Entity
@Table(name = "PATIENT_INSURANCE", schema = "dbo", catalog = "localspringbootdb")
public class PatientInsuranceEntity {
    private int patientInsuranceId;
    private Date effectiveDate;
    private String groupNumber;
    private String medicaidNumber;
    private InsuranceEntity insuranceId;
    private PatientEntity patientId;

    @Id
    @Column(name = "PATIENT_INSURANCE_ID")
    public int getPatientInsuranceId() {
        return patientInsuranceId;
    }

    public void setPatientInsuranceId(int patientInsuranceId) {
        this.patientInsuranceId = patientInsuranceId;
    }

    @Basic
    @Column(name = "EFFECTIVE_DATE")

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @Basic
    @Column(name = "GROUP_NUMBER")
    public String getGroupNumber(){return groupNumber;}

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Basic
    @Column(name = "MEDICAID_NUMBER")
    public String getMedicaidNumber(){return medicaidNumber;}

    public void setMedicaidNumber(String medicaidNumber) {
        this.medicaidNumber = medicaidNumber;
    }

    @ManyToOne
    @JoinColumn(name = "INSURANCE_ID")
    public InsuranceEntity getInsuranceId(){return insuranceId;}

    public void setInsuranceId(InsuranceEntity insuranceId) {
        this.insuranceId = insuranceId;
    }

    @ManyToOne
    @JoinColumn(name = "PATIENT_ID")
    public PatientEntity getPatientId(){return patientId;}

    public void setPatientId(PatientEntity patientId) {
        this.patientId = patientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientInsuranceEntity that = (PatientInsuranceEntity) o;
        return patientInsuranceId == that.patientInsuranceId &&
                patientId == that.patientId &&
                insuranceId == that.insuranceId &&
                Objects.equals(groupNumber, that.groupNumber) &&
                Objects.equals(medicaidNumber, that.medicaidNumber) &&
                Objects.equals(effectiveDate, that.effectiveDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientInsuranceId, effectiveDate, groupNumber, medicaidNumber, insuranceId, patientId);
    }
}
