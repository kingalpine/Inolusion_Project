package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.IncidentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Incident_Repository extends CrudRepository<IncidentEntity, Long> {
    IncidentEntity findByIncidentId (int incidentId);
}
