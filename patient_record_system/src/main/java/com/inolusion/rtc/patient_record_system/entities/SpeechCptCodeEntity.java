package com.inolusion.rtc.patient_record_system.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "speech_cpt_code", schema = "dbo", catalog = "Inolusion_PRS")
public class SpeechCptCodeEntity {
    private int speechCptCodeId;
    private String speechCptCodeName;
    private String speechCptCodeDesc;

    @Id
    @Column(name = "speech_cpt_code_id")
    public int getSpeechCptCodeId() {
        return speechCptCodeId;
    }

    public void setSpeechCptCodeId(int speechCptCodeId) {
        this.speechCptCodeId = speechCptCodeId;
    }

    @Basic
    @Column(name = "speech_cpt_code_name")
    public String getSpeechCptCodeName() {
        return speechCptCodeName;
    }

    public void setSpeechCptCodeName(String speechCptCodeName) {
        this.speechCptCodeName = speechCptCodeName;
    }

    @Basic
    @Column(name = "speech_cpt_code_desc")
    public String getSpeechCptCodeDesc() {
        return speechCptCodeDesc;
    }

    public void setSpeechCptCodeDesc(String speechCptCodeDesc) {
        this.speechCptCodeDesc = speechCptCodeDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpeechCptCodeEntity that = (SpeechCptCodeEntity) o;
        return speechCptCodeId == that.speechCptCodeId &&
                Objects.equals(speechCptCodeName, that.speechCptCodeName) &&
                Objects.equals(speechCptCodeDesc, that.speechCptCodeDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speechCptCodeId, speechCptCodeName, speechCptCodeDesc);
    }
}
