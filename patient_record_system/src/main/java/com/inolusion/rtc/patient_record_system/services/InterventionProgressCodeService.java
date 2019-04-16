package com.inolusion.rtc.patient_record_system.services;

import com.inolusion.rtc.patient_record_system.entities.InterventionProgressCodeEntity;
import com.inolusion.rtc.patient_record_system.repositories.InterventionProgressCode_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class InterventionProgressCodeService implements Formatter<InterventionProgressCodeEntity> {

    @Autowired
    private InterventionProgressCode_Repository interventionProgressCode_repository;


    @Override
    public InterventionProgressCodeEntity parse(String s, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(s);
        return interventionProgressCode_repository.findByInterventionProgressCodeId(id);
    }

    @Override
    public String print(InterventionProgressCodeEntity interventionProgressCodeEntity, Locale locale) {
        return null;
    }
}
