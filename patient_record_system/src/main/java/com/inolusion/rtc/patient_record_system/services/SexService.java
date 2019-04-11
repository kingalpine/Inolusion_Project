package com.inolusion.rtc.patient_record_system.services;


import com.inolusion.rtc.patient_record_system.entities.PatientEntity;
import com.inolusion.rtc.patient_record_system.entities.SexTypeEntity;
import com.inolusion.rtc.patient_record_system.repositories.Patient_Repository;
import com.inolusion.rtc.patient_record_system.repositories.Sex_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import javax.persistence.metamodel.Type;
import java.text.ParseException;
import java.util.Locale;


@Service
public class  SexService implements Formatter<SexTypeEntity> {

    @Autowired
    private Sex_Repository sex_repository;


    @Override
    public String print(SexTypeEntity patientEntity, Locale locale) {
        return null;
    }

    @Override
    public SexTypeEntity parse(String s, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(s);
        return this.sex_repository.findBySexTypeId(id);
    }
}
