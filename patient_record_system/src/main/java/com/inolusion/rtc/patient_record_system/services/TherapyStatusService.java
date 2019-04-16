package com.inolusion.rtc.patient_record_system.services;

import com.inolusion.rtc.patient_record_system.entities.TherapyStatusEntity;
import com.inolusion.rtc.patient_record_system.repositories.TherapyStatus_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class TherapyStatusService implements Formatter<TherapyStatusEntity> {
    @Autowired
    private TherapyStatus_Repository therapyStatus_repository;

    @Override
    public TherapyStatusEntity parse(String s, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(s);
        return therapyStatus_repository.findByTherapyStatusId(id);
    }

    @Override
    public String print(TherapyStatusEntity therapyStatusEntity, Locale locale) {
        return null;
    }
}
