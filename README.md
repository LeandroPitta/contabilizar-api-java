# Contabilizar API Java

## Project Description

The project is built using a modern tech stack, including Java with Spring Boot for the backend. The application follows a multi-tier architecture, ensuring separation of concerns and scalability. The backend is compiled as a `.war` file, prepared for deployment on a server like JBoss/WildFly.

### Backend

The backend is developed using Spring Boot, which provides a robust and scalable framework for building Java applications. It leverages Spring Data JPA for database interactions and Spring Web for building RESTful APIs. The backend is responsible for handling business logic, data processing, and communication with the PostgreSQL database.

Key components:
- **Controllers**: Handle HTTP requests and map them to appropriate service methods.
- **Services**: Contain business logic and interact with repositories.
- **Repositories**: Interface with the database using Spring Data JPA.
- **Entities**: Represent the data model and are mapped to database tables.

### Database

The application uses PostgreSQL as the database management system. It stores all the contract data, including user information, transactions, contracts, and categories. The database schema is designed to ensure data integrity and efficient querying.

## Frontend API

The frontend API for this project is hosted separately. You can find the backend API repository at [contabilizar](https://github.com/LeandroPitta/contabilizar).

## Production Environment

The application runs in production at [contabilizar.leandropitta.com.br](https://contabilizar.leandropitta.com.br).

## Tech Stack

<img alt="My Skills" src="https://skillicons.dev/icons?i=java,spring,postgres">

## Prerequisites
- **Java JDK** (version 17)
- **Maven** (version 3.8.1)
- **PostgreSQL** (version 13)
- **JBoss/WildFly** (version 26.1.2.Final)

## Getting Started

### Backend
1. **Install Dependencies**: 
   - Navigate to the root directory and run:
     ```bash
     mvn install
     ```
2. **Environment Variables** (Optional): 
   - Copy the `application.properties` file and configure your database connection.
3. **Database Setup** (Optional): 
   - Ensure that PostgreSQL is running and properly configured.
   - *Note: Steps 2 and 3 are not mandatory if you choose to use the pre-configured database.*
4. **Start Backend**: 
   ```bash
   mvn spring-boot:run
   ```

## Help
For more help, refer to:
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
