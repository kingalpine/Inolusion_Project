package com.inolusion.rtc.patient_record_system.controllers;



import com.inolusion.rtc.patient_record_system.entities.PatientEntity;
import com.inolusion.rtc.patient_record_system.repositories.Patient_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class PageController {

    @Autowired
    private Patient_Repository repository;

    @GetMapping("/patient_records_table")
    public String showPatientRecordsPage(Model md) {


        for (int x = 1; x <= repository.count(); x++)
        {
            List list = repository.findByPatientId(x);
            String patient_id = list.get(0).toString();
            String[] words = patient_id.split("\\s+");
            md.addAttribute("patient_array", words);
        }
        return "patient_records_table";
    }

    @GetMapping("/add_patient_form")
    public String showAddPatientFormPage(){
        return "add_patient_form";
    }

    @GetMapping("/employee_records")
    public String showEmployeeRecordsPage() { return "employee_records";}

    @GetMapping("/therapy_session")
    public String showTherapySessionPage() {return "therapy_session";}

    @GetMapping("/reports")
    public String showReportsPage() {return "reports";}

/*

 @GetMapping("/greeting")
    public String showGreetingPage(){
    return "greeting";
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
*/
}

