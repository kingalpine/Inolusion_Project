package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.PlanCodeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanCode_Repository extends CrudRepository<PlanCodeEntity, Long> {
}
