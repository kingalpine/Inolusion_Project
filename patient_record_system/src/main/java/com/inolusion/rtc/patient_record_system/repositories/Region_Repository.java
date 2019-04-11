package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.RegionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Region_Repository extends CrudRepository<RegionEntity, Long> {

    RegionEntity findByRegionId (int regionId);
}
