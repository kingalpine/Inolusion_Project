package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "INTERVENTION_PROGRESS_CODE", schema = "dbo", catalog = "localspringbootdb")
public class InterventionProgressCodeEntity {
    private int interventionProgressCodeId;
    private int interventionCodeId;
    private int therapyProgressNoteId;

    @Id
    @Column(name = "INTERVENTION_PROGRESS_CODE_ID")
    public int getInterventionProgressCodeId() {
        return interventionProgressCodeId;
    }

    public void setInterventionProgressCodeId(int interventionProgressCodeId) {
        this.interventionProgressCodeId = interventionProgressCodeId;
    }

    @Basic
    @Column(name = "INTERVENTION_CODE_ID")
    public int getInterventionCodeId() {
        return interventionCodeId;
    }

    public void setInterventionCodeId(int interventionCodeId) {
        this.interventionCodeId = interventionCodeId;
    }

    @Basic
    @Column(name = "THERAPY_PROGRESS_NOTE_ID")
    public int getTherapyProgressNoteId() {
        return therapyProgressNoteId;
    }

    public void setTherapyProgressNoteId(int therapyProgressNoteId) {
        this.therapyProgressNoteId = therapyProgressNoteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InterventionProgressCodeEntity that = (InterventionProgressCodeEntity) o;
        return interventionProgressCodeId == that.interventionProgressCodeId &&
                interventionCodeId == that.interventionCodeId &&
                therapyProgressNoteId == that.therapyProgressNoteId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(interventionProgressCodeId, interventionCodeId, therapyProgressNoteId);
    }
}
