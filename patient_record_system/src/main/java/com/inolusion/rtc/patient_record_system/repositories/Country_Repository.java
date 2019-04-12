package com.inolusion.rtc.patient_record_system.repositories;

import com.inolusion.rtc.patient_record_system.entities.CountryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Country_Repository extends CrudRepository <CountryEntity,Long> {
    CountryEntity findByCountryId (int countryId);
}
