package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.IncidentEntity;
import com.inolusion.rtc.patient_record_system.entities.IncidentStatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentStatus_Repository extends CrudRepository<IncidentStatusEntity, Long> {
    IncidentStatusEntity findByIncidentStatusId (int incidentStatusId);
}
