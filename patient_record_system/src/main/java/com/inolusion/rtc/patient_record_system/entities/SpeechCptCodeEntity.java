package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SPEECH_CPT_CODE", schema = "dbo", catalog = "localspringbootdb")
public class SpeechCptCodeEntity {
    private int speechCptCodeId;
    private String name;

    @Id
    @Column(name = "SPEECH_CPT_CODE_ID")
    public int getSpeechCptCodeId() {
        return speechCptCodeId;
    }

    public void setSpeechCptCodeId(int speechCptCodeId) {
        this.speechCptCodeId = speechCptCodeId;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpeechCptCodeEntity that = (SpeechCptCodeEntity) o;
        return speechCptCodeId == that.speechCptCodeId &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speechCptCodeId, name);
    }
}
