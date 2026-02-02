package com.smartcare.clinic_management.repository;

import com.smartcare.clinic_management.model.Patient; // Ensure you have a Patient.java in your model folder too!
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    // Standard CRUD operations are inherited from JpaRepository
}