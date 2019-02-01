package com.inolusion.rtc.patient_record_system.controllers;

import com.inolusion.rtc.patient_record_system.entities.PatientEntity;
import com.inolusion.rtc.patient_record_system.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
public class PageController {

    @Autowired
    private PatientRepository repository;

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
        List<PatientEntity> patientEntities = repository.findByFirstName("John");
        md.addAllAttributes(patientEntities);
        return "patients";
    }
}

