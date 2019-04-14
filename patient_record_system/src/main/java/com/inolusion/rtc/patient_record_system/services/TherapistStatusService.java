package com.inolusion.rtc.patient_record_system.services;

import com.inolusion.rtc.patient_record_system.entities.TherapistStatusEntity;
import com.inolusion.rtc.patient_record_system.repositories.TherapistStatus_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class TherapistStatusService implements Formatter<TherapistStatusEntity> {

    @Autowired
    private TherapistStatus_Repository therapistStatus_repository;


    @Override
    public TherapistStatusEntity parse(String s, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(s);
        return therapistStatus_repository.findByTherapistStatusId(id);
    }

    @Override
    public String print(TherapistStatusEntity therapistStatusEntity, Locale locale) {
        return null;
    }
}
