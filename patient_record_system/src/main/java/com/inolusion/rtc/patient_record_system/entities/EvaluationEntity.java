package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "evaluation", schema = "dbo", catalog = "localspringbootdb")
public class EvaluationEntity {
    private int evaluationId;
    private String evaluationSummary;

    @Id
    @Column(name = "evaluation_id")
    public int getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(int evaluationId) {
        this.evaluationId = evaluationId;
    }

    @Basic
    @Column(name = "evaluation_summary")
    public String getEvaluationSummary() {
        return evaluationSummary;
    }

    public void setEvaluationSummary(String evaluationSummary) {
        this.evaluationSummary = evaluationSummary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EvaluationEntity that = (EvaluationEntity) o;
        return evaluationId == that.evaluationId &&
                Objects.equals(evaluationSummary, that.evaluationSummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluationId, evaluationSummary);
    }
}
