
package com.klu.controller;

import org.springframework.web.bind.annotation.*;
import com.klu.model.Patient;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @PostMapping
    public String insertPatient(@RequestBody Patient patient) {

        return "Patient record created successfully\n" +
               "Patient ID: " + patient.getId() + "\n" +
               "Patient Name: " + patient.getName() + "\n" +
               "Patient Age: " + patient.getAge();
    }
}
