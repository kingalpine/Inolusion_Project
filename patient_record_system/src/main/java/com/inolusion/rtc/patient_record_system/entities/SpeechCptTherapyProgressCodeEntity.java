package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SPEECH_CPT_THERAPY_PROGRESS_CODE", schema = "dbo", catalog = "localspringbootdb")
public class SpeechCptTherapyProgressCodeEntity {
    private int speechCptTherapyProgressCodeId;
    private int speechCptCodeId;
    private int therapyProgressNoteId;

    @Id
    @Column(name = "SPEECH_CPT_THERAPY_PROGRESS_CODE_ID")
    public int getSpeechCptTherapyProgressCodeId() {
        return speechCptTherapyProgressCodeId;
    }

    public void setSpeechCptTherapyProgressCodeId(int speechCptTherapyProgressCodeId) {
        this.speechCptTherapyProgressCodeId = speechCptTherapyProgressCodeId;
    }

    @Basic
    @Column(name = "SPEECH_CPT_CODE_ID")
    public int getSpeechCptCodeId() {
        return speechCptCodeId;
    }

    public void setSpeechCptCodeId(int speechCptCodeId) {
        this.speechCptCodeId = speechCptCodeId;
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
        SpeechCptTherapyProgressCodeEntity that = (SpeechCptTherapyProgressCodeEntity) o;
        return speechCptTherapyProgressCodeId == that.speechCptTherapyProgressCodeId &&
                speechCptCodeId == that.speechCptCodeId &&
                therapyProgressNoteId == that.therapyProgressNoteId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speechCptTherapyProgressCodeId, speechCptCodeId, therapyProgressNoteId);
    }
}
