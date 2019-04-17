package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.TherapistIncidentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TherapistIncident_Repository extends CrudRepository<TherapistIncidentEntity, Long> {
    TherapistIncidentEntity findByIncidentId (int incidentId);
}
