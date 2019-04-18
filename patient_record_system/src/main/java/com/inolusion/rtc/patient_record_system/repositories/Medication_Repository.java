package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.MedicationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Medication_Repository extends CrudRepository<MedicationEntity, Long> {
}
