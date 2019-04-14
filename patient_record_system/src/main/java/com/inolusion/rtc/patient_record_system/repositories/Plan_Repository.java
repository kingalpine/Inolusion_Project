package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.PlanEntity;
import com.inolusion.rtc.patient_record_system.entities.TherapyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Plan_Repository extends CrudRepository<PlanEntity, Long> {
    PlanEntity findByTherapyId (TherapyEntity therapyId);
}
