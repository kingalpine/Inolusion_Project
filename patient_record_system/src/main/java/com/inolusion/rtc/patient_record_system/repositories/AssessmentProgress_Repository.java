package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.AssessmentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentProgress_Repository extends CrudRepository<AssessmentEntity, Long> {
}
