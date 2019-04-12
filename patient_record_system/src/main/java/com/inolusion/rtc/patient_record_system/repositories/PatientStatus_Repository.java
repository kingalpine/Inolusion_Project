package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.PatientStatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientStatus_Repository extends CrudRepository<PatientStatusEntity, Long> {
    PatientStatusEntity findByPatientStatusId (int patientStatusId);
}
