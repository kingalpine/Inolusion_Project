package com.inolusion.rtc.patient_record_system.controllers;



import com.inolusion.rtc.patient_record_system.repositories.Patient_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @Autowired
    private Patient_Repository repository;

    @GetMapping("/patient_records_table")
    public String showPatientRecordsPage(Model md) {


        md.addAttribute("patient_array", repository.findAll());
       /* for (int x = 1; x <= repository.count(); x++)
        {
            List list = repository.findByPatientId(x);
            String patient_id = list.get(0).toString();
            String [] words = patient_id.split("\\s+");
            md.addAttribute("patient_array", words);
        }*/
        return "PatientRecords_Table";
    }

    @GetMapping("/add_patient_form")
    public String showAddPatientFormPage(){
        return "AddPatientForm";
    }

    @GetMapping("/employee_records")
    public String showEmployeeRecordsPage() { return "Employees_Table";}

    @GetMapping("/therapy_session")
    public String showTherapySessionPage() {return "TherapySessions_Table";}

    @GetMapping("/reports")
    public String showReportsPage() {return "reports";}

    @GetMapping("/modify_patient_form")
    public String showModifyPatientFormPage() {return "ModifyPatientForm";}

    @GetMapping("/add_therapy_session")
    public String showAddTherapySession() {return "AddTherapySession";}

    @GetMapping("/add_employee_form")
    public String showAddEmployeeForm() {return "AddEmployeeForm";}

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

