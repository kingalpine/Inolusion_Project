package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "objective", schema = "dbo", catalog = "Inolusion_PRS")
public class ObjectiveEntity {
    private int objectiveId;
    private String objectiveSummary;

    @Id
    @Column(name = "objective_id")
    public int getObjectiveId() {
        return objectiveId;
    }

    public void setObjectiveId(int objectiveId) {
        this.objectiveId = objectiveId;
    }

    @Basic
    @Column(name = "objective_summary")
    public String getObjectiveSummary() {
        return objectiveSummary;
    }

    public void setObjectiveSummary(String objectiveSummary) {
        this.objectiveSummary = objectiveSummary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectiveEntity that = (ObjectiveEntity) o;
        return objectiveId == that.objectiveId &&
                Objects.equals(objectiveSummary, that.objectiveSummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectiveId, objectiveSummary);
    }
}
