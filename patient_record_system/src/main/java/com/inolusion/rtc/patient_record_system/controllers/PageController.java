package com.inolusion.rtc.patient_record_system.controllers;



import com.inolusion.rtc.patient_record_system.entities.IncidentEntity;
import com.inolusion.rtc.patient_record_system.entities.PatientEntity;
import com.inolusion.rtc.patient_record_system.entities.TherapistEntity;
import com.inolusion.rtc.patient_record_system.entities.TherapyEntity;
import com.inolusion.rtc.patient_record_system.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.inolusion.rtc.patient_record_system.services.SexService;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.jws.WebParam;


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

    @Autowired
    private PatientStatus_Repository patientStatus_repository;

    @Autowired
    private TherapistStatus_Repository therapistStatus_repository;

    @Autowired
    private TherapyStatus_Repository therapyStatus_repository;

    @Autowired
    private Incident_Repository incident_repository;

    @Autowired
    private Discharge_Repository discharge_repository;

    @Autowired
    private InterventionProgressCode_Repository interventionProgressCode_repository;

    @Autowired
    private Speech_CPT_TPC_Repository speech_cpt_tpc_repository;

    @Autowired
    private SubjectiveAnalysis_Repository subjectiveAnalysis_repository;

    @Autowired
    private Plan_Repository plan_repository;

    @Autowired
    private TherapyMedication_Repository therapyMedication_repository;

    @Autowired
    private Medical_History_Repository medical_history_repository;

    @Autowired
    private IncidentStatus_Repository incidentStatus_repository;

    @Autowired
    private PatientIncident_Repository patientIncident_repository;

    @Autowired
    private TherapistIncident_Repository therapistIncident_repository;

    @GetMapping("/index.html")
    public String showMainMenu(){
        return "index";
    }

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
        model.addAttribute("patient_status_array", patientStatus_repository.findAll());
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
        return "PatientRecords_Table";
    }

    @GetMapping("/modify_patient_table/{id}")
    public String showModifyPatientTable(@PathVariable("id") int id, Model md) {
        PatientEntity patient = patient_repository.findByPatientId(id);
        md.addAttribute("region_array", region_repository.findAll());
        md.addAttribute("country_array", country_repository.findAll());
        md.addAttribute("insurance_array", insurance_repository.findAll());
        md.addAttribute("sex_array", sex_repository.findAll());
        md.addAttribute("patient_status_array", patientStatus_repository.findAll());
        md.addAttribute("patient", patient);
        return "ModifyPatientTable";
    }
    @PostMapping("/modify_patient/{id}")
    public String modifyPatient(@PathVariable("id") int id, PatientEntity patient, BindingResult result,Model md){
            if (result.hasErrors()){
                patient.setPatientId(id);
                return "ModifyPatientTable";
            }
            patient.setPatientId(id);
            patient_repository.save(patient);
            md.addAttribute("patient_array", patient_repository.findAll());
            return "PatientRecords_Table";
    }



    @GetMapping("/employee_records")
    public String showEmployeeRecordsPage(Model md) {

        md.addAttribute("therapist_array", therapist_repository.findAll());
        return "Employees_Table";
    }
    @GetMapping("/add_employee_form")
    public String showAddEmployeeForm(Model md) {
        TherapistEntity therapist = new TherapistEntity();
        md.addAttribute("therapist_status_array", therapistStatus_repository.findAll());
        md.addAttribute("therapist", therapist);
            return "AddTherapistForm";
        }
    @PostMapping("/add_employee")
    public String addEmployee(@ModelAttribute("therapist") TherapistEntity therapist, BindingResult result, Model md){
        therapist_repository.save(therapist);
        md.addAttribute("therapist_array", therapist_repository.findAll());
        return "Employees_Table";
    }

    @GetMapping("/modify_employee_form/{id}")
    public String showModifyEmployeeForm(@PathVariable("id") int id, Model md){
        TherapistEntity therapist = therapist_repository.findByTherapistId(id);
        md.addAttribute("therapist_status_array", therapistStatus_repository.findAll());
        md.addAttribute("therapist", therapist);
        return "ModifyTherapistForm";
    }
    @PostMapping("/modify_employee/{id}")
    public String modifyEmployee(@PathVariable("id") int id, TherapistEntity therapist, BindingResult result, Model md){
            if (result.hasErrors()){
                therapist.setTherapistId(id);
                return "ModifyTherapistForm";
            }
            therapist.setTherapistId(id);
            therapist_repository.save(therapist);
            md.addAttribute("therapist_array", therapist_repository.findAll());
            return "Employees_Table";
    }

    @GetMapping("/delete_employee_form/{id}")
    public String showDeleteEmployeeForm(@PathVariable("id") int id, Model md){
        TherapistEntity therapist = therapist_repository.findByTherapistId(id);
        md.addAttribute("therapist", therapist);
        return "DeleteTherapistForm";
    }
    @PostMapping("/delete_employee/{id}")
    public String deleteEmployee(@PathVariable("id") int id, Model md){
            TherapistEntity therapist = therapist_repository.findByTherapistId(id);
            therapist_repository.delete(therapist);
            md.addAttribute("therapist_array", therapist_repository.findAll());
            return "Employees_Table";
    }


    @GetMapping("/therapy_session")
    public String showTherapySessionPage(Model md) {
        md.addAttribute("therapy_array", therapy_repository.findAll());
        return "TherapySessions_Table";
        }
    @GetMapping("/add_therapy_session_form")
    public String showAddTherapySession(Model md) {
            TherapyEntity therapy = new TherapyEntity();
            md.addAttribute("therapy_status_array", therapyStatus_repository.findAll());
            md.addAttribute("therapy", therapy);
            return "AddTherapySession";
        }
        @PostMapping("/add_therapy_session")
        public String addTherapySession(@ModelAttribute("therapy") TherapyEntity therapy, BindingResult result, Model md){
            therapy_repository.save(therapy);
            md.addAttribute("therapy_array", therapy_repository.findAll());
            return "TherapySessions_Table";
        }

    @GetMapping("/delete_therapy_session_form/{id}")
    public String showDeleteTherapySession(@PathVariable("id") int id, Model md) {
        TherapyEntity therapy = therapy_repository.findByTherapyId(id);
        md.addAttribute("therapy", therapy);
            return "DeleteTherapySessionForm";
        }
        @PostMapping("/delete_therapy_session/{id}")
        public String deleteTherapySession(@PathVariable("id") int id, Model md){
            TherapyEntity therapy = therapy_repository.findByTherapyId(id);
            therapy_repository.delete(therapy);
            md.addAttribute("therapy_array", therapy_repository.findAll());
            return "TherapySessions_Table";
        }

        @GetMapping("/modify_therapy_session_form/{id}")
        public String showModifyTherapySession(@PathVariable("id") int id, Model md){
            TherapyEntity therapy = therapy_repository.findByTherapyId(id);
            md.addAttribute("therapy_status_array", therapyStatus_repository.findAll());
            md.addAttribute("therapy_object",therapy);
            return "ModifyTherapySessionForm";
        }

        @PostMapping("/modify_therapy_session/{id}")
    public String ModifyTherapySession(@PathVariable("id") int id, TherapyEntity therapy, BindingResult result, Model md) {
        if (result.hasErrors()){
            therapy.setTherapyId(id);
            return "ModifyTherapySessionForm";
        }
        therapy.setTherapyId(id);
        therapy_repository.save(therapy);
        md.addAttribute("therapy_array", therapy_repository.findAll());
            return "TherapySessions_Table";
        }
        @GetMapping("/view_therapy_note/{id}")
        public String showTherapyProgressForm(@PathVariable("id") int id, Model md){
            TherapyEntity therapy = therapy_repository.findByTherapyId(id);
            md.addAttribute("therapy", therapy);
            md.addAttribute("medication", therapyMedication_repository.findByTherapyId(therapy));
            md.addAttribute("subjective", subjectiveAnalysis_repository.findByTherapyId(therapy));
            md.addAttribute("cpt_code",speech_cpt_tpc_repository.findByTherapyId(therapy));
            md.addAttribute("intervention_code", interventionProgressCode_repository.findByTherapyId(therapy));
            md.addAttribute("plan_stuff", plan_repository.findByTherapyId(therapy));
            md.addAttribute("discharge_array", discharge_repository.findAll());
            return "ViewTherapyNote";
        }
    @GetMapping("/add_therapy_note_form/{id}")
    public String showAddTherapyProgressForm(@PathVariable("id") int id, Model md) {
            TherapyEntity therapy = therapy_repository.findByTherapyId(id);
            md.addAttribute("therapy", therapy);
            md.addAttribute("medication", therapyMedication_repository.findByTherapyId(therapy));
            md.addAttribute("subjective", subjectiveAnalysis_repository.findByTherapyId(therapy));
            md.addAttribute("cpt_code",speech_cpt_tpc_repository.findByTherapyId(therapy));
            md.addAttribute("intervention_code", interventionProgressCode_repository.findByTherapyId(therapy));
            md.addAttribute("plan_stuff", plan_repository.findByTherapyId(therapy));
            md.addAttribute("discharge_array", discharge_repository.findAll());
            return "AddTherapyProgressNotes";
        }
        @PostMapping("/add_therapy_note/{id}")
        public String addTherapyProgressNote(@PathVariable("id") int id, TherapyEntity therapy, BindingResult result, Model md){
            therapy_repository.save(therapy);

            return "TherapySessions_Table";
        }
    @GetMapping("/delete_therapy_note_form/{id}")
    public String showDeleteTherapyProgressForm(@PathVariable("id") int id, Model md) {
            return "DeleteTherapyNotes";
        }
    @GetMapping("/modify_therapy_note_form/{id}")
    public String showModifyTherapyProgressForm(@PathVariable("id") int id, Model md) {
            return "ModifyTherapyNotes";
        }

    @GetMapping("/incidents_table")
    public String showIncidentTable(Model md) {
            md.addAttribute("incident_array", incident_repository.findAll());

            return "Incidents_Table";
        }
        @GetMapping("/add_incident_form")
        public String showAddIncidentForm(Model md){
            IncidentEntity incident = new IncidentEntity();
            md.addAttribute("patient_incident", patientIncident_repository.findAll());
            md.addAttribute("therapist_incident", therapyMedication_repository.findAll());
            md.addAttribute("incident_status_array", incidentStatus_repository.findAll());
            md.addAttribute("incident", incident);
            return "AddIncidentForm";
        }
        @PostMapping("/add_incident")
        public String addIncident(@ModelAttribute("incident") IncidentEntity incident, BindingResult result, Model md){
            incident_repository.save(incident);
            md.addAttribute("incident_array",incident_repository.findAll());
            return "Incidents_Table";
        }
        @GetMapping("/modify_incident_form/{id}")
        public String showModifyIncidentForm(@PathVariable("id") int id, Model md){
            IncidentEntity incident = incident_repository.findByIncidentId(id);
            md.addAttribute("incident", incident);
            return "ModifyIncident";
        }
        @PostMapping("/modify_incident/{id}")
        public String modifyIncident(@PathVariable("id") int id, IncidentEntity incident, BindingResult result, Model md){
            incident.setIncidentId(id);
            incident_repository.save(incident);
            md.addAttribute("incident_array",incident_repository.findAll());
            return "Incidents_Table";
        }

        @GetMapping("/delete_incident_form/{id}")
        public String showDeleteIncidentForm(@PathVariable("id") int id, Model md){
            IncidentEntity incident = incident_repository.findByIncidentId(id);
            md.addAttribute("incident", incident);
            return "DeleteIncident";
        }
        @PostMapping("/delete_incident/{id}")
        public String deleteIncident(@PathVariable("id") int id,Model md){
            IncidentEntity incident = incident_repository.findByIncidentId(id);
            incident_repository.delete(incident);
            md.addAttribute("incident_array", incident_repository.findAll());
            return "Incidents_Table";
        }

        @GetMapping("/reports")
        public String showReportsPage() {

            return "Reports";
        }









}

