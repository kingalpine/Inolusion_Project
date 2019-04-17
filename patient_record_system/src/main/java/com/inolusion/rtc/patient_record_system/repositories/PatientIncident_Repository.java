package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.PatientEntity;
import com.inolusion.rtc.patient_record_system.entities.PatientIncidentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientIncident_Repository extends CrudRepository<PatientIncidentEntity, Long> {
    PatientIncidentEntity findByIncidentId (int incidentId);
}
