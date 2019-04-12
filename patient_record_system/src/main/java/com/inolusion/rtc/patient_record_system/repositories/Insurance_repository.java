package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.InsuranceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Insurance_repository extends CrudRepository<InsuranceEntity, Long> {
    InsuranceEntity findByInsuranceId (int insuranceId);
}
