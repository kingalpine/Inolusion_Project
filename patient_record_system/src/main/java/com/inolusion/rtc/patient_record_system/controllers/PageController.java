package com.inolusion.rtc.patient_record_system.controllers;



import com.inolusion.rtc.patient_record_system.entities.AllergyEntity;
import com.inolusion.rtc.patient_record_system.entities.MedicationHistoryEntity;
import com.inolusion.rtc.patient_record_system.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @Autowired
    private Patient_Repository patient_repository;

    @Autowired
    private Therapist_Repository therapist_repository;

    @Autowired
    private Therapy_Repository therapy_repository;

    @GetMapping("/patient_records_table")
    public String showPatientRecordsPage(Model md) {


        md.addAttribute("patient_array", patient_repository.findAll());

        return "PatientRecords_Table";
    }

    @GetMapping("/add_patient_form")
    public String showAddPatientFormPage(){
        return "AddPatientForm";
    }

    @GetMapping("/employee_records")
    public String showEmployeeRecordsPage(Model md) {

        md.addAttribute("therapist_array", therapist_repository.findAll());
        return "Employees_Table";
    }

    @GetMapping("/therapy_session")
    public String showTherapySessionPage(Model md) {
        md.addAttribute("therapy_array", therapy_repository.findAll());
        return "TherapySessions_Table";}

    @GetMapping("/reports")
    public String showReportsPage() {return "Reports";}

    @GetMapping("/add_therapy_session")
    public String showAddTherapySession() {return "AddTherapySession";}

    @GetMapping("/add_employee_form")
    public String showAddEmployeeForm() {return "AddEmployeeForm";}

    @GetMapping("/delete_patient_table")
    public String showDeletePatientTable() {return "DeletePatientTable";}

    @GetMapping("/incidents_table")
    public String showIncidentTable() {return "Incidents_Table";}

    @GetMapping("/therapy_progress_notes")
    public String showTherapyProgressTable() {return "TherapyProgressNotes_Table";}

    @GetMapping("/modify_patient_table")
    public String showModifyPatientTable() {return "ModifyPatientTable";}

    @GetMapping("/modify_patient_form")
    public String showModifyPatientForm() {return "ModifyPatientForm";}


}

