package com.inolusion.rtc.patient_record_system.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {



    @GetMapping("/greeting")
    public String showGreetingPage(){
    return "greeting";
    }

    @GetMapping("/patient_records_table")
    public String showPatientRecordsPage() {
        return "PatientRecords_Table";
    }

    @GetMapping("/add_patient_form")
    public String showAddPatientFormPage(){
        return "AddPatientForm";
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

        String name;
        return "patients";
    }

}

