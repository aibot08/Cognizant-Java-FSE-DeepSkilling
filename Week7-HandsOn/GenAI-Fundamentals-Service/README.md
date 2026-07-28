# Week 7: GenAI Fundamentals Service

## Objective
Provide a Spring Boot 3 microservice integrating GenAI APIs for automated code explanation, test generation, and intelligent software engineering assistance.

## Key Endpoints
- `GET /api/genai/health`: Returns service health status.
- `POST /api/genai/process`: Accepts JSON prompt requests and task types (`explain`, `generate_tests`, `summarize`, `chat`).

## Build & Test
```bash
# Compile and run unit tests with Maven
mvn clean test

# Run application locally
mvn spring-boot:run
```
