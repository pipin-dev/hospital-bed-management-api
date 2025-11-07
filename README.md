# Hospital Bed Management API

Minimal Spring Boot REST API for managing hospital wards, rooms, and beds.

## Tech Stack
- Java 17
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Maven

## Run
1. Make sure PostgreSQL is running and a database named `hospitaldb` exists.
2. Update username/password in `src/main/resources/application.yml` if needed.
3. Run:
   ```bash
   mvn spring-boot:run
   ```

## Endpoints
- GET /api/beds
- GET /api/beds/ward/{wardName}
- POST /api/beds

## Author
Pipin-dev
