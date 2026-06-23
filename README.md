# Spring Data JPA Relational Hospital API

A Java and Spring Boot project focused on relational database modeling, Spring Data JPA, PostgreSQL, entity relationships, and foreign key mapping in a hospital management domain.

The project models a basic hospital/surgery system with doctors, nurses, patients, surgeries, and operations.

## Overview

This project was developed as a hands-on backend and database modeling project.

The main goal was to practice designing relational database structures, creating connected domain models, and understanding how foreign key relationships work in a Spring Boot and PostgreSQL environment.

The application includes hospital-related entities such as:

* `Doctor`
* `Nurse`
* `Patient`
* `Surgery`
* `Operation`

The project focuses on relational schema design, entity relationships, and multi-table data modeling.

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven
* Relational database design
* Entity relationship modeling
* Foreign key mapping

## Core Concepts Practiced

* Relational database schema design
* Spring Data JPA setup
* PostgreSQL integration
* Entity modeling
* Primary key usage
* Foreign key relationships
* Multi-table relational structures
* Hospital domain modeling
* Database-backed application structure

## Domain Model

### Doctor

Represents a doctor in the hospital system.

Main fields:

* `id`
* `name`
* `surname`
* `proficiency`

### Nurse

Represents a nurse in the hospital system.

Main fields:

* `id`
* `name`
* `surname`
* `proficiency`

### Patient

Represents a patient in the hospital system.

Main fields:

* `id`
* `name`
* `surname`
* `email`
* `complaint`

### Surgery

Represents a surgery record connected to a nurse, patient, and doctor.

Main fields:

* `id`
* `nurse_id`
* `patient_id`
* `doctor_id`

### Operation

Represents an operation record connected to a patient and doctor.

Main fields:

* `id`
* `patient_id`
* `doctor_id`

## Relationship Structure

```text
Doctor
  ├── Surgery
  └── Operation

Patient
  ├── Surgery
  └── Operation

Nurse
  └── Surgery
```

The `surgery` table connects doctors, nurses, and patients.
The `operation` table connects doctors and patients.

## Database Tables

| Table       | Purpose                                                              |
| ----------- | -------------------------------------------------------------------- |
| `doctor`    | Stores doctor information                                            |
| `nurse`     | Stores nurse information                                             |
| `patient`   | Stores patient information                                           |
| `surgery`   | Stores surgery records with doctor, nurse, and patient relationships |
| `operation` | Stores operation records with doctor and patient relationships       |

## What I Practiced

* Designing relational tables
* Using primary keys and foreign keys
* Modeling hospital-related database entities
* Understanding multi-table relationships
* Connecting Spring Boot with PostgreSQL
* Working with Spring Data JPA
* Creating database-backed domain models
* Structuring relational data for backend applications

## Project Structure

```text
src/
 └── main/
     ├── java/
     │   └── ...
     │       ├── entity/
     │       ├── repository/
     │       └── ...
     └── resources/
         └── application.properties
```

## Getting Started

### Prerequisites

Make sure you have the following installed:

* Java 17+
* Maven
* PostgreSQL
* IntelliJ IDEA or another Java IDE

### Installation

Clone the repository:

```bash
git clone https://github.com/emreyildirim-33/spring-data-jpa-relational-hospital-api.git
cd spring-data-jpa-relational-hospital-api
```

Configure your database connection in `application.properties`.

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

Run the project:

```bash
./mvnw spring-boot:run
```

## Notes

This project was built as a backend/database training project focused on relational schema design, foreign key relationships, Spring Data JPA, and PostgreSQL integration.

The main focus was not building a full production hospital management system, but practicing relational database modeling and backend persistence concepts.

## Repository

GitHub: https://github.com/emreyildirim-33/spring-data-jpa-relational-hospital-api
