package com.inolusion.rtc.patient_record_system.controllers;



import com.inolusion.rtc.patient_record_system.entities.PatientEntity;
import com.inolusion.rtc.patient_record_system.entities.TherapistEntity;
import com.inolusion.rtc.patient_record_system.repositories.*;
import com.inolusion.rtc.patient_record_system.services.SexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PageController {

    @Autowired
    private Patient_Repository patient_repository;

    @Autowired
    private Therapist_Repository therapist_repository;

    @Autowired
    private Therapy_Repository therapy_repository;

    @Autowired
    private Region_Repository region_repository;

    @Autowired
    private Country_Repository country_repository;

    @Autowired
    private Insurance_repository insurance_repository;

    @Autowired
    private Sex_Repository sex_repository;

    @GetMapping("/patient_records_table")
    public String showPatientRecordsPage(Model md) {


        md.addAttribute("patient_array", patient_repository.findAll());

        return "PatientRecords_Table";
    }
    @GetMapping("/add_patient_form")
    public String showAddPatientFormPage(Model model){
        PatientEntity patient = new PatientEntity();
        model.addAttribute("region_array", region_repository.findAll());
        model.addAttribute("country_array", country_repository.findAll());
        model.addAttribute("insurance_array", insurance_repository.findAll());
        model.addAttribute("sex_array", sex_repository.findAll());
        model.addAttribute("patient", patient);

        return "AddPatientForm";
    }
    @PostMapping("/add_patient")
    public String addPatient (@ModelAttribute("patient") PatientEntity patient, BindingResult result, Model model){


        patient_repository.save(patient);
        model.addAttribute("patient_array", patient_repository.findAll());
        return "PatientRecords_Table";
    }
    @GetMapping("/delete_patient_table/{id}")
    public String showDeletePatientTable(@PathVariable("id") int id, Model md) {
        PatientEntity patient = patient_repository.findByPatientId(id);
        md.addAttribute("patient", patient);
        System.out.println(patient.getPatientId());
        return "DeletePatientForm";
    }
    @PostMapping("/delete_patient/{id}")
    public String deletePatient(@PathVariable("id") int id, Model md){
        PatientEntity patient = patient_repository.findByPatientId(id);
        patient_repository.delete(patient);
        md.addAttribute("patient_array", patient_repository.findAll());
        return "index";
    }

    @GetMapping("/modify_patient_table/{id}")
    public String showModifyPatientTable(@PathVariable("id") int id, Model md) {
        PatientEntity patient = patient_repository.findByPatientId(id);
        md.addAttribute("patient", patient);
        return "ModifyPatientTable";
    }



    @GetMapping("/employee_records")
    public String showEmployeeRecordsPage(Model md) {

        md.addAttribute("therapist_array", therapist_repository.findAll());
        return "Employees_Table";
    }
    @GetMapping("/add_employee_form")
    public String showAddEmployeeForm() {return "AddEmployeeForm";}
    @GetMapping("/modify_employee_form/{id}")
    public String showModifyEmployeeForm(@PathVariable("id") int id, Model md){
        TherapistEntity therapist = therapist_repository.findByTherapistId(id);
        md.addAttribute("therapist", therapist);
        return "ModifyTherapistForm";
    }
    @GetMapping("/delete_employee_form/{id}")
    public String showDeleteEmployeeForm(@PathVariable("id") int id, Model md){
        TherapistEntity therapist = therapist_repository.findByTherapistId(id);
        md.addAttribute("therapist", therapist);
        return "DeleteTherapistForm";
    }


    @GetMapping("/therapy_session")
    public String showTherapySessionPage(Model md) {
        md.addAttribute("therapy_array", therapy_repository.findAll());
        return "TherapySessions_Table";}
    @GetMapping("/add_therapy_session")
    public String showAddTherapySession() {return "AddTherapySession";}
    @GetMapping("/delete_therapy_session/{id}")
    public String showDeleteTherapySession(@PathVariable("id") int id, Model md) {return "DeleteTherapySessionForm";}
    @GetMapping("/modify_therapy_session{id}")
    public String showModifyTherapySession(@PathVariable("id") int id, Model md) {return "ModifyTherapySessionNotes";}


    @GetMapping("/therapy_progress_notes")
    public String showTherapyProgressTable() {return "TherapyProgressNotes_Table";}
    @GetMapping("/add_therapy_progress_notes")
    public String showAddTherapyProgressForm() {return "AddTherapyProgressNotes";}
    @GetMapping("/delete_therapy_progress_notes/{id}")
    public String showDeleteTherapyProgressForm(@PathVariable("id") int id, Model md) {return "DeleteTherapyNotes";}
    @GetMapping("/modify_therapy_progress_notes/{id}")
    public String showModifyTherapyProgressForm(@PathVariable("id") int id, Model md) {return "ModifyTherapyNotes";}


    @GetMapping("/reports")
    public String showReportsPage() {return "Reports";}


    @GetMapping("/incidents_table")
    public String showIncidentTable() {return "Incidents_Table";}






}

