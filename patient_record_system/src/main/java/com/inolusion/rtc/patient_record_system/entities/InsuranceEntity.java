package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "insurance", schema = "dbo", catalog = "localspringbootdb")
public class InsuranceEntity {
    private int insuranceId;
    private String insuranceName;
    private Integer insuranceGroupNumber;
    private Integer insuranceGroupId;

    @Id
    @Column(name = "insurance_id")
    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    @Basic
    @Column(name = "insurance_name")
    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    @Basic
    @Column(name = "insurance_group_number")
    public Integer getInsuranceGroupNumber() {
        return insuranceGroupNumber;
    }

    public void setInsuranceGroupNumber(Integer insuranceGroupNumber) {
        this.insuranceGroupNumber = insuranceGroupNumber;
    }

    @Basic
    @Column(name = "insurance_group_id")
    public Integer getInsuranceGroupId() {
        return insuranceGroupId;
    }

    public void setInsuranceGroupId(Integer insuranceGroupId) {
        this.insuranceGroupId = insuranceGroupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InsuranceEntity that = (InsuranceEntity) o;
        return insuranceId == that.insuranceId &&
                Objects.equals(insuranceName, that.insuranceName) &&
                Objects.equals(insuranceGroupNumber, that.insuranceGroupNumber) &&
                Objects.equals(insuranceGroupId, that.insuranceGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(insuranceId, insuranceName, insuranceGroupNumber, insuranceGroupId);
    }
}
