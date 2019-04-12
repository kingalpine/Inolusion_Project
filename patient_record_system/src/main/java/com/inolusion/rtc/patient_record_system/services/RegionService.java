package com.inolusion.rtc.patient_record_system.services;

import com.inolusion.rtc.patient_record_system.entities.RegionEntity;
import com.inolusion.rtc.patient_record_system.repositories.Region_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class RegionService implements Formatter<RegionEntity> {

    @Autowired
    private Region_Repository region_repository;

    @Override
    public RegionEntity parse(String s, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(s);
        return this.region_repository.findByRegionId(id);
    }

    @Override
    public String print(RegionEntity regionEntity, Locale locale) {
        return null;
    }
}
