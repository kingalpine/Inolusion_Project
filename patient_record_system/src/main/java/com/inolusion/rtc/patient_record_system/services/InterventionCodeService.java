package com.inolusion.rtc.patient_record_system.services;

import com.inolusion.rtc.patient_record_system.entities.InterventionCodeEntity;
import com.inolusion.rtc.patient_record_system.repositories.InterventionCode_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class InterventionCodeService implements Formatter<InterventionCodeEntity> {
    @Autowired
    private InterventionCode_Repository interventionCode_repository;

    @Override
    public InterventionCodeEntity parse(String s, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(s);
        return interventionCode_repository.findByInterventionCodeId(id);
    }

    @Override
    public String print(InterventionCodeEntity interventionCodeEntity, Locale locale) {
        return null;
    }
}
