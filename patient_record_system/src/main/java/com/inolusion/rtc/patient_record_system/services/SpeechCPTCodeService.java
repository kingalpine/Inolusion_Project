package com.inolusion.rtc.patient_record_system.services;

import com.inolusion.rtc.patient_record_system.entities.SpeechCptCodeEntity;
import com.inolusion.rtc.patient_record_system.repositories.SpeechCPTCode_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class SpeechCPTCodeService implements Formatter<SpeechCptCodeEntity> {

    @Autowired
    private SpeechCPTCode_Repository speechCPTCode_repository;

    @Override
    public SpeechCptCodeEntity parse(String s, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(s);
        return speechCPTCode_repository.findBySpeechCptCodeId(id);
    }

    @Override
    public String print(SpeechCptCodeEntity speechCptCodeEntity, Locale locale) {
        return null;
    }
}
