package com.inolusion.rtc.patient_record_system.services;

import com.inolusion.rtc.patient_record_system.entities.SubjectiveCodeEntity;
import com.inolusion.rtc.patient_record_system.repositories.SubjectiveCode_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class SubjectiveCodeService implements Formatter<SubjectiveCodeEntity> {
    @Autowired
    private SubjectiveCode_Repository subjectiveCode_repository;

    @Override
    public SubjectiveCodeEntity parse(String s, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(s);
        return subjectiveCode_repository.findBySubjectiveCodeId(id);
    }

    @Override
    public String print(SubjectiveCodeEntity subjectiveCodeEntity, Locale locale) {
        return null;
    }
}
