# Creating Microservices for Account

## Project
- Account Microservice

## Technology
- Java 21
- Spring Boot
- Spring Web

## Endpoint

GET /accounts/{number}

Example:

http://localhost:8080/accounts/00987987973432

Sample Response

{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343
}
