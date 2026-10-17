package com.klu.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.Doctor;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

	@PostMapping
	public String insertDoc(@RequestBody Doctor doctor) {
		return "Doctor data inserted successfully" +
	     "DoctorID: " + doctor.getId() +
	     "DcotorName: " +doctor.getName();
	}
}
