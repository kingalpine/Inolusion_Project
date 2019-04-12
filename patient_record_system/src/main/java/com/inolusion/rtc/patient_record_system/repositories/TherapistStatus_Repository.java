package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.TherapistEntity;
import com.inolusion.rtc.patient_record_system.entities.TherapistStatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TherapistStatus_Repository extends CrudRepository<TherapistStatusEntity, Long> {
    TherapistStatusEntity findByTherapistStatusId (int therapistStatusId);
}
