package com.inolusion.rtc.patient_record_system.services;

import com.inolusion.rtc.patient_record_system.entities.TherapistEntity;
import com.inolusion.rtc.patient_record_system.repositories.Therapist_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class TherapistService implements Formatter<TherapistEntity> {
    @Autowired
    private Therapist_Repository therapist_repository;

    @Override
    public TherapistEntity parse(String s, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(s);
        return therapist_repository.findByTherapistId(id);
    }

    @Override
    public String print(TherapistEntity therapistEntity, Locale locale) {
        return null;
    }
}
