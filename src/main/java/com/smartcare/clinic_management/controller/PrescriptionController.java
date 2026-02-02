package com.smartcare.clinic_management.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @PostMapping("/add")
    public Map<String, String> createPrescription(@RequestBody Map<String, Object> prescriptionData) {
        // Logic to save to MongoDB would go here
        Map<String, String> response = new HashMap<>();
        response.put("status", "Success");
        response.put("message", "Prescription saved to NoSQL database");
        return response;
    }
}