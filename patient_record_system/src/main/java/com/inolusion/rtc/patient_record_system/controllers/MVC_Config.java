package com.inolusion.rtc.patient_record_system.controllers;

import com.inolusion.rtc.patient_record_system.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;

@Configuration
public class MVC_Config implements MVC_Config_2 {

    @Autowired
    private SexService sexService;

    @Autowired
    private RegionService regionService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private PatientStatusService patientStatusService;

    @Override
    public void addFormatters(FormatterRegistry registry){
        registry.addFormatter(sexService);
        registry.addFormatter(regionService);
        registry.addFormatter(countryService);
        registry.addFormatter(insuranceService);
        registry.addFormatter(patientStatusService);
    }
}
