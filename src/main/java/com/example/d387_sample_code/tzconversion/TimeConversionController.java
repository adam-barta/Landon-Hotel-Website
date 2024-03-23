package com.example.d387_sample_code.tzconversion;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController
public class TimeConversionController {
    @GetMapping("/conversion")
    public String[] convertTime(){
        return TimeConversion.convertedTime();
    }
}