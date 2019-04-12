package com.inolusion.rtc.patient_record_system.repositories;


import com.inolusion.rtc.patient_record_system.entities.SexTypeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Sex_Repository extends CrudRepository<SexTypeEntity,Long> {

    SexTypeEntity findBySexTypeId (int sexId);
}
