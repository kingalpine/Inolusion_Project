package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ASSESSMENT_PROGRESS", schema = "dbo", catalog = "localspringbootdb")
public class AssessmentEntity {
    private int assessmentProgressId;
    private String name;


    @Id
    @Column(name = "ASSESSMENT_PROGRESS_ID")
    public int getAssessmentProgressId() { return assessmentProgressId;}

    public void setAssessmentProgressId(int assessmentProgressId) {
        this.assessmentProgressId = assessmentProgressId;
    }

    @Basic
    @Column(name = "NAME")
    public String getName(){return name;}

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssessmentEntity that = (AssessmentEntity) o;
        return assessmentProgressId == that.assessmentProgressId &&
                Objects.equals(name, that.name) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(assessmentProgressId, name);
    }
}
