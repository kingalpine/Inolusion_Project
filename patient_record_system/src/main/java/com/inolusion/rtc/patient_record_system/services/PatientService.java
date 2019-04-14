package com.inolusion.rtc.patient_record_system.services;

import com.inolusion.rtc.patient_record_system.entities.PatientEntity;
import com.inolusion.rtc.patient_record_system.repositories.Patient_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class PatientService implements Formatter<PatientEntity> {
    @Autowired
    private Patient_Repository patient_repository;

    @Override
    public PatientEntity parse(String s, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(s);
        return patient_repository.findByPatientId(id);
    }

    @Override
    public String print(PatientEntity patientEntity, Locale locale) {
        return null;
    }
}
