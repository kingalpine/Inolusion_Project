package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "evaluation_status", schema = "dbo", catalog = "localspringbootdb")
public class EvaluationStatusEntity {
    private int evaluationStatusId;
    private String evaluationStatusDesc;

    @Id
    @Column(name = "evaluation_status_id")
    public int getEvaluationStatusId() {
        return evaluationStatusId;
    }

    public void setEvaluationStatusId(int evaluationStatusId) {
        this.evaluationStatusId = evaluationStatusId;
    }

    @Basic
    @Column(name = "evaluation_status_desc")
    public String getEvaluationStatusDesc() {
        return evaluationStatusDesc;
    }

    public void setEvaluationStatusDesc(String evaluationStatusDesc) {
        this.evaluationStatusDesc = evaluationStatusDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EvaluationStatusEntity that = (EvaluationStatusEntity) o;
        return evaluationStatusId == that.evaluationStatusId &&
                Objects.equals(evaluationStatusDesc, that.evaluationStatusDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluationStatusId, evaluationStatusDesc);
    }
}
