package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.SpeechCptCodeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeechCPTCode_Repository extends CrudRepository<SpeechCptCodeEntity, Long> {
    SpeechCptCodeEntity findBySpeechCptCodeId (int speechCptId);
}
