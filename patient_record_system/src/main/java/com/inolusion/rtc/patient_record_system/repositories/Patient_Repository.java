package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.PatientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Patient_Repository extends CrudRepository<PatientEntity, Long> {
    List<PatientEntity> findByPatientFname (String firstName);

    List<PatientEntity> findByPatientId (int PatientID);

    @Override
    long count();
}
