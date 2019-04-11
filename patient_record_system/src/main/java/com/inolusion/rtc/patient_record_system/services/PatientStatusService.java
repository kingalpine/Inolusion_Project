package com.inolusion.rtc.patient_record_system.services;

import com.inolusion.rtc.patient_record_system.entities.PatientStatusEntity;
import com.inolusion.rtc.patient_record_system.repositories.PatientStatus_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class PatientStatusService implements Formatter<PatientStatusEntity> {
    @Autowired
    private PatientStatus_Repository patientStatus_repository;

    @Override
    public PatientStatusEntity parse(String s, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(s);
        return patientStatus_repository.findByPatientStatusId(id);
    }

    @Override
    public String print(PatientStatusEntity patientStatusEntity, Locale locale) {
        return null;
    }
}
