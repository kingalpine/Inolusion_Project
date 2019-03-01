package com.inolusion.rtc.patient_record_system.controllers;

import com.inolusion.rtc.patient_record_system.entities.PatientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {



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
        /*
        String name = patientRepository.findByPatientFname("John").toString();
        String country = countryRepository.findByCountryCode("US").toString();
        String region = regionRepository.findByRegionCode("TX").toString();
        md.addAttribute("patients", name);
        md.addAttribute("patients", country);
        md.addAttribute("patients", region); */

        return "patients";
    }

}

