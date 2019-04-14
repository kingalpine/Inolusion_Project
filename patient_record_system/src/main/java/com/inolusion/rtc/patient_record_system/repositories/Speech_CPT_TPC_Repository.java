package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.SpeechCptTherapyProgressCodeEntity;
import com.inolusion.rtc.patient_record_system.entities.TherapyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Speech_CPT_TPC_Repository extends CrudRepository<SpeechCptTherapyProgressCodeEntity, Long> {
    SpeechCptTherapyProgressCodeEntity findByTherapyId (TherapyEntity therapyId);
}
