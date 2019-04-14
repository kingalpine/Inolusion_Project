package com.inolusion.rtc.patient_record_system.services;

import com.inolusion.rtc.patient_record_system.entities.InterventionProgressCodeEntity;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class InterventionProgressCodeService implements Formatter<InterventionProgressCodeEntity> {



    @Override
    public InterventionProgressCodeEntity parse(String s, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(InterventionProgressCodeEntity interventionProgressCodeEntity, Locale locale) {
        return null;
    }
}
