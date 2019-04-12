package com.inolusion.rtc.patient_record_system.services;

import com.inolusion.rtc.patient_record_system.entities.InsuranceEntity;
import com.inolusion.rtc.patient_record_system.repositories.Insurance_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class InsuranceService implements Formatter<InsuranceEntity> {

    @Autowired
    private Insurance_repository insurance_repository;

    @Override
    public InsuranceEntity parse(String s, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(s);
        return insurance_repository.findByInsuranceId(id);
    }

    @Override
    public String print(InsuranceEntity insuranceEntity, Locale locale) {
        return null;
    }
}
