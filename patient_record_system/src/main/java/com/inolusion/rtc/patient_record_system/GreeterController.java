package com.inolusion.rtc.patient_record_system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreeterController {

    @GetMapping("/greeting")
    public String showIndexPage(){
    return "greeting";
    }
}
