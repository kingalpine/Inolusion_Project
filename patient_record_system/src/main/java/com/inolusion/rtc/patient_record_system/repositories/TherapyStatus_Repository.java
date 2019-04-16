package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.TherapyStatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TherapyStatus_Repository extends CrudRepository<TherapyStatusEntity, Long> {
    TherapyStatusEntity findByTherapyStatusId (int therapyStatusId);
}
