package com.inolusion.rtc.patient_record_system.services;

import com.inolusion.rtc.patient_record_system.entities.TherapyMedicationEntity;
import com.inolusion.rtc.patient_record_system.repositories.TherapyMedication_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class TherapyMedicationService implements Formatter<TherapyMedicationEntity> {
    @Autowired
    private TherapyMedication_Repository therapyMedication_repository;

    @Override
    public TherapyMedicationEntity parse(String s, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(s);
        return therapyMedication_repository.findByTherapyMedicationId(id);
    }

    @Override
    public String print(TherapyMedicationEntity therapyMedicationEntity, Locale locale) {
        return null;
    }
}
