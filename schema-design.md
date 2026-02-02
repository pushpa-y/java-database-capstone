# Smart Clinic Management System - Database Design

## 1. Relational Database (MySQL)
The relational schema manages the core business logic and relationships.

### Tables:
- **Doctors**: Stores doctor profiles, specialties, and contact info.
- **Patients**: Stores patient credentials and contact details.
- **Appointments**: Maps patients to doctors with specific dates and times.



## 2. NoSQL Database (MongoDB)
We use MongoDB to store **Prescriptions**. Since prescriptions can vary in length and detail (different medicines, dosages, and notes), a document-based store provides the necessary flexibility.

## 3. Architecture
The system follows a microservices-ready approach where the Spring Boot backend interacts with MySQL for structured data and MongoDB for flexible medical records.