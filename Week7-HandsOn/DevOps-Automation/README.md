# Week 7: DevOps Lifecycle Automation

## Objective
Provide automated shell and PowerShell deployment scripts for continuous integration, image building, container health auditing, and clean environment teardown.

## Scripts Overview
- `build_and_run.sh`: Automated multi-service compilation, container building, and deployment launch.
- `health_check.sh`: Polls REST API health endpoints (`/actuator/health`).
- `cleanup.sh`: Stops running containers, prunes unused volumes, and clears dangling images.
