package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "OBJECTIVE", schema = "dbo", catalog = "LaptopDB")
public class ObjectiveEntity {
    private int objectiveId;
    private String goals;
    private String statement;

    @Id
    @Column(name = "OBJECTIVE_ID")
    public int getObjectiveId() {
        return objectiveId;
    }

    public void setObjectiveId(int objectiveId) {
        this.objectiveId = objectiveId;
    }

    @Basic
    @Column(name = "GOALS")
    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    @Basic
    @Column(name = "STATEMENT")
    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectiveEntity that = (ObjectiveEntity) o;
        return objectiveId == that.objectiveId &&
                Objects.equals(goals, that.goals) &&
                Objects.equals(statement, that.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectiveId, goals, statement);
    }
}
