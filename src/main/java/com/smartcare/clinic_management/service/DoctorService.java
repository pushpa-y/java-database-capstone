package com.smartcare.clinic_management.service;

import com.smartcare.clinic_management.model.Doctor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorService {
    public List<Doctor> getAllDoctors() {
        return List.of(); // Returns list of doctors for the UI
    }
    
    public List<Doctor> findBySpeciality(String speciality) {
        return List.of();
    }
}