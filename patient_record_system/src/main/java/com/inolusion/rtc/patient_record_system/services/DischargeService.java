package com.inolusion.rtc.patient_record_system.services;

import com.inolusion.rtc.patient_record_system.entities.DischargeEntity;
import com.inolusion.rtc.patient_record_system.repositories.Discharge_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class DischargeService implements Formatter<DischargeEntity> {
    @Autowired
    private Discharge_Repository discharge_repository;

    @Override
    public DischargeEntity parse(String s, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(s);
        return discharge_repository.findByDischargeId(id);
    }

    @Override
    public String print(DischargeEntity dischargeEntity, Locale locale) {
        return null;
    }
}
