package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.PatientInsuranceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientInsurance_Repository extends CrudRepository<PatientInsuranceEntity, Long> {
}
