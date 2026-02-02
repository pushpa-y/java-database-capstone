package com.smartcare.clinic_management.service;

import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class TokenService {
    // In a real app, this would use a library like jjwt
    public String generateToken(String email) {
        return "mock-jwt-token-for-" + email + "-valid-until-" + new Date(System.currentTimeMillis() + 3600000);
    }

    public boolean validateToken(String token) {
        return token != null && token.startsWith("mock-jwt-token");
    }
}