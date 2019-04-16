package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SPEECH_CPT_THERAPY_PROGRESS_CODE", schema = "dbo", catalog = "LaptopDB")
public class SpeechCptTherapyProgressCodeEntity {
    private int speechCptTherapyProgressCodeId;
    private SpeechCptCodeEntity speechCptCodeId;
    private String speechCptDesc;
    private TherapyEntity therapyId;

    @Id
    @Column(name = "SPEECH_CPT_THERAPY_PROGRESS_CODE_ID")
    public int getSpeechCptTherapyProgressCodeId() {
        return speechCptTherapyProgressCodeId;
    }

    public void setSpeechCptTherapyProgressCodeId(int speechCptTherapyProgressCodeId) {
        this.speechCptTherapyProgressCodeId = speechCptTherapyProgressCodeId;
    }

    @ManyToOne
    @JoinColumn(name = "SPEECH_CPT_CODE_ID")
    public SpeechCptCodeEntity getSpeechCptCodeId() {
        return speechCptCodeId;
    }

    public void setSpeechCptCodeId(SpeechCptCodeEntity speechCptCodeId) {
        this.speechCptCodeId = speechCptCodeId;
    }

    @Basic
    @Column(name = "SPEECH_CPT_DESC")
    public String getSpeechCptDesc() {
        return speechCptDesc;
    }

    public void setSpeechCptDesc(String speechCptDesc) {
        this.speechCptDesc = speechCptDesc;
    }

    @ManyToOne
    @JoinColumn(name = "THERAPY_ID")
    public TherapyEntity getTherapyId() {
        return therapyId;
    }

    public void setTherapyId(TherapyEntity therapyId) {
        this.therapyId = therapyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpeechCptTherapyProgressCodeEntity that = (SpeechCptTherapyProgressCodeEntity) o;
        return speechCptTherapyProgressCodeId == that.speechCptTherapyProgressCodeId &&
                speechCptCodeId == that.speechCptCodeId &&
                therapyId == that.therapyId &&
                Objects.equals(speechCptDesc, that.speechCptDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speechCptTherapyProgressCodeId, speechCptCodeId, speechCptDesc, therapyId);
    }
}
