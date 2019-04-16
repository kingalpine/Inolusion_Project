package com.inolusion.rtc.patient_record_system.services;

import javafx.util.converter.TimeStringConverter;
import org.springframework.cglib.core.Converter;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Service
public class LocalTimeConverter implements Formatter<LocalTime> {


    @Override
    public LocalTime parse(String s, Locale locale) throws ParseException {
        LocalTime t = LocalTime.parse(s);
        return t;
    }

    @Override
    public String print(LocalTime localTime, Locale locale) {
        return null;
    }
}
