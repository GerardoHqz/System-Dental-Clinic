# Dental Clinic Management System

This project involves the development of a management system for a dental clinic, utilizing technologies such as JSP (JavaServer Pages), JPA (Java Persistence API), and Java EE (Enterprise Edition). The chosen database is PostgreSQL, providing a robust and scalable solution.

## Key Features

### Authentication
The system provides a secure authentication system to ensure authorized access for users. Each user is assigned a specific set of permissions based on their role.

### Dentist Management
- **View Dentists:** Visualize the list of registered dentists in the clinic.
- **Create Dentist:** Add new dentists to the system with detailed information.
- **Edit Dentist:** Update information for an existing dentist.
- **Delete Dentist:** Remove records of dentists no longer associated with the clinic.

### Patient Management
- **View Patients:** Access the list of registered patients in the clinic.
- **Create Patient:** Add new patients to the system with comprehensive information.
- **Edit Patient:** Update information for an existing patient.
- **Delete Patient:** Remove patient records as needed.

### User Management
- **View Users:** Display the list of system users.
- **Create User:** Add new users with specific roles and permissions.
- **Edit User:** Modify information for an existing user.
- **Delete User:** Remove users who no longer require access to the system.


## Project Configuration

### System Requirements
- Java EE compatible with JSP
- PostgreSQL as the database management system

### Database Configuration
1. Create a PostgreSQL database named `clinic_dental`.
2. Update the `persistence.xml` configuration file with the database connection information.

### Deployment
Deploy the application on a Java EE-compatible server, ensuring that environment variables and necessary resources are properly configured.

