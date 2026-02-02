package com.smartcare.clinic_management.controller;

import com.smartcare.clinic_management.model.Doctor;
import com.smartcare.clinic_management.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> getDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/search")
    public List<Doctor> getDoctorsBySpeciality(@RequestParam String speciality) {
        return doctorService.findBySpeciality(speciality);
    }
}