package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.IncidentTypeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentType_Repository extends CrudRepository<IncidentTypeEntity, Long> {
}
