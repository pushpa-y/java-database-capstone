package com.smartcare.clinic_management.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialty;
    private String email;
    private String availableHours;

    // Default constructor is required by JPA
    public Doctor() {}
}