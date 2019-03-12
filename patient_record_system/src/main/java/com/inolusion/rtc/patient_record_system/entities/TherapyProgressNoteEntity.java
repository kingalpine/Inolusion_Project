package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "therapy_progress_note", schema = "dbo", catalog = "localspringbootdb")
public class TherapyProgressNoteEntity {
    private int therapyProgressNoteId;
    private String therapistSignature;

    @Id
    @Column(name = "therapy_progress_note_id")
    public int getTherapyProgressNoteId() {
        return therapyProgressNoteId;
    }

    public void setTherapyProgressNoteId(int therapyProgressNoteId) {
        this.therapyProgressNoteId = therapyProgressNoteId;
    }

    @Basic
    @Column(name = "therapist_signature")
    public String getTherapistSignature() {
        return therapistSignature;
    }

    public void setTherapistSignature(String therapistSignature) {
        this.therapistSignature = therapistSignature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TherapyProgressNoteEntity that = (TherapyProgressNoteEntity) o;
        return therapyProgressNoteId == that.therapyProgressNoteId &&
                Objects.equals(therapistSignature, that.therapistSignature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(therapyProgressNoteId, therapistSignature);
    }
}
