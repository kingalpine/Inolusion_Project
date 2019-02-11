package com.inolusion.rtc.patient_record_system.controllers;

import com.inolusion.rtc.patient_record_system.entities.PatientEntity;
import com.inolusion.rtc.patient_record_system.repositories.CountryRepository;
import com.inolusion.rtc.patient_record_system.repositories.PatientRepository;
import com.inolusion.rtc.patient_record_system.repositories.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;


@Controller
public class PageController {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private RegionRepository regionRepository;

    @GetMapping("/greeting")
    public String showGreetingPage(){
    return "greeting";
    }

    @GetMapping("/patient_records")
    public String showPatientRecordsPage() {
        return "patient_records";
    }
    @GetMapping("/treatment_plan_progress")
    public String showTreatmentPlanProgressPage(){
        return "treatment_plan_progress";
    }


    @GetMapping("/patients")
    public String showPatientsPage (Model md){
        String name = patientRepository.findByPatientFname("John").toString();
        String country = countryRepository.findByCountryCode("US").toString();
        String region = regionRepository.findByRegionCode("TX").toString();
        md.addAttribute("patients", name);
        md.addAttribute("patients", country);
        md.addAttribute("patients", region);

        return "patients";
    }

}

