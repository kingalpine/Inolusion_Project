package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.InterventionCodeEntity;
import com.inolusion.rtc.patient_record_system.entities.InterventionProgressCodeEntity;
import com.inolusion.rtc.patient_record_system.entities.TherapyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterventionProgressCode_Repository extends CrudRepository<InterventionProgressCodeEntity, Long> {
    InterventionProgressCodeEntity findByTherapyId (TherapyEntity therapyId);
    InterventionProgressCodeEntity findByInterventionProgressCodeId (int ipcId);
}
