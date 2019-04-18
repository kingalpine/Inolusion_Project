package com.inolusion.rtc.patient_record_system.services;

import com.inolusion.rtc.patient_record_system.entities.MedicationEntity;
import com.inolusion.rtc.patient_record_system.repositories.Medication_Repository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class MedicationService implements Formatter<MedicationEntity> {
    @Autowired
    private Medication_Repository medication_repository;

    @Override
    public MedicationEntity parse(String s, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(s);
        return medication_repository.findByMedicationId(id);
    }

    @Override
    public String print(MedicationEntity medicationEntity, Locale locale) {
        return null;
    }
}
