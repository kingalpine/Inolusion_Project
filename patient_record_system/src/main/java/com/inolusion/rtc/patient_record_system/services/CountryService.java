package com.inolusion.rtc.patient_record_system.services;

import com.inolusion.rtc.patient_record_system.entities.CountryEntity;
import com.inolusion.rtc.patient_record_system.repositories.Country_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class CountryService implements Formatter<CountryEntity> {

    @Autowired
    private Country_Repository country_repository;

    @Override
    public CountryEntity parse(String s, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(s);
        return country_repository.findByCountryId(id);
    }

    @Override
    public String print(CountryEntity countryEntity, Locale locale) {
        return null;
    }
}
