package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.TherapyEntity;
import com.inolusion.rtc.patient_record_system.entities.TherapyMedicationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TherapyMedication_Repository extends CrudRepository<TherapyMedicationEntity, Long> {
    TherapyMedicationEntity findByTherapyId (TherapyEntity therapyId);
}
