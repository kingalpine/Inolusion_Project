package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.DischargeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Discharge_Repository extends CrudRepository<DischargeEntity, Long> {
    DischargeEntity findByDischargeId (int dischargeId);
}
