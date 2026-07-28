#!/bin/bash
echo "=========================================================="
echo "      Cognizant Java FSE DevOps Automation Script          "
echo "=========================================================="

echo "[1/4] Building Spring Boot Maven Microservices..."
cd ../04-GenAI-Fundamentals-Service && mvn clean package -DskipTests
cd ../01-Dockerization-Microservices

echo "[2/4] Building Multi-Stage Docker Images..."
docker-compose build

echo "[3/4] Starting Microservices Infrastructure Stack..."
docker-compose up -d

echo "[4/4] Verifying Service Health Statuses..."
sleep 15
docker-compose ps

echo "DevOps deployment completed successfully."
