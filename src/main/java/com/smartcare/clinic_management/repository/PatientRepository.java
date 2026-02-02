package com.smartcare.clinic_management.repository;

import com.smartcare.clinic_management.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    /**
     * Requirement: Retrieve a patient using their email address.
     * This method allows the system to look up a patient during login.
     */
    Optional<Patient> findByEmail(String email);

    /**
     * Requirement: Lookup based on either an email address or a phone number.
     * This satisfies the criteria for multi-field lookup capability.
     */
    Optional<Patient> findByEmailOrPhoneNumber(String email, String phoneNumber);

    /**
     * Check if a patient already exists by email.
     * Useful for preventing duplicate registrations.
     */
    Boolean existsByEmail(String email);
}
