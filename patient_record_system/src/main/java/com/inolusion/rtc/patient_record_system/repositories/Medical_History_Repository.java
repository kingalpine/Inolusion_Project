package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.MedicationHistoryEntity;
import com.inolusion.rtc.patient_record_system.entities.PatientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Medical_History_Repository extends CrudRepository<MedicationHistoryEntity,Long> {
    MedicationHistoryEntity findByPatientId (PatientEntity patientId);
}
