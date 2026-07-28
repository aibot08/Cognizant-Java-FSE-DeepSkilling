# Week 7: Microservices Dockerization

## Objective
Containerize Spring Boot microservices, Angular/React web clients, PostgreSQL database, API Gateway, and Discovery Server into isolated, lightweight, multi-stage Docker images orchestrated via Docker Compose.

## Key Features
- **Multi-stage Builds**: Stage 1 Maven builder, Stage 2 JRE 21 execution image.
- **Docker Compose Orchestration**: Configured environment variables, network bridges, volume persistence, and service dependency health checks.
- **NGINX Reverse Proxy**: Routes API requests to backend API Gateway.

## Execution Commands
```bash
# Build and launch multi-container stack in detached mode
docker-compose up -d --build

# Inspect running container statuses
docker-compose ps

# View container logs
docker-compose logs -f

# Shut down and cleanup resources
docker-compose down -v
```
