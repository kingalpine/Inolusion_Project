package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.SubjectiveAnalysisEntity;
import com.inolusion.rtc.patient_record_system.entities.TherapyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectiveAnalysis_Repository extends CrudRepository<SubjectiveAnalysisEntity, Long> {
    SubjectiveAnalysisEntity findByTherapyId (TherapyEntity therapyId);
}
