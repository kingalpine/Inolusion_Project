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
    private Employee_Repository employee_repository;

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

        md.addAttribute("employee_array", employee_repository.findAll());
        return "Employees_Table";
    }

    @GetMapping("/therapy_session")
    public String showTherapySessionPage(Model md) {
        md.addAttribute("therapy_array", therapy_repository.findAll());
        return "TherapySessions_Table";}

    @GetMapping("/reports")
    public String showReportsPage() {return "ReportsPage";}

    @GetMapping("/modify_patient_form")
    public String showModifyPatientFormPage() {return "ModifyPatientForm";}

    @GetMapping("/add_therapy_session")
    public String showAddTherapySession() {return "AddTherapySession";}

    @GetMapping("/add_employee_form")
    public String showAddEmployeeForm() {return "AddEmployeeForm";}


}

