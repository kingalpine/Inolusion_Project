package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.SubjectiveCodeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectiveCode_Repository extends CrudRepository<SubjectiveCodeEntity, Long> {
    SubjectiveCodeEntity findBySubjectiveCodeId (int subjectiveCodeId);
}
