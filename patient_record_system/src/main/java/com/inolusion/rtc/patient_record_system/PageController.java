package com.inolusion.rtc.patient_record_system;

import org.springframework.stereotype.Controller;
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
}
