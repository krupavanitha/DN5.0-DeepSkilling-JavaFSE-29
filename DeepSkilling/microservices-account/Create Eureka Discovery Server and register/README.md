# Eureka Discovery Server with Account & Loan Microservices

## Overview

This project demonstrates Service Discovery using Netflix Eureka in Spring Boot.

The project consists of three applications:

- Discovery Server (Port: 8761)
- Account Microservice (Port: 8080)
- Loan Microservice (Port: 8081)

Both microservices register themselves with the Eureka Discovery Server.

---

## Technologies Used

- Java 21
- Spring Boot 4.1.0
- Spring Cloud Netflix Eureka
- Maven
- Eclipse IDE

---

## Project Structure

```
microservices-account/
│
├── discovery-server
├── account
└── loan
```

---

## Configuration

### Discovery Server

Port:

```
8761
```

### Account Service

```
spring.application.name=account
server.port=8080
```

### Loan Service

```
spring.application.name=loan
server.port=8081
```

---

## Running the Project

Start the applications in the following order:

1. Discovery Server
2. Account Service
3. Loan Service

---

## Eureka Dashboard

Open:

```
http://localhost:8761
```

Registered services:

- ACCOUNT
- LOAN

---

## Output

The Eureka Dashboard displays:

```
ACCOUNT  UP (1)
LOAN     UP (1)
```

indicating that both microservices are successfully registered with the Discovery Server.

---

## Author

Prakash
