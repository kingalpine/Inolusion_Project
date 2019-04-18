package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.InterventionCodeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterventionCode_Repository extends CrudRepository<InterventionCodeEntity, Long> {
    InterventionCodeEntity findByInterventionCodeId (int interventionCodeId);
}
