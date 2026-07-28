# Week 7: Cloud Infrastructure & Deployment

## Objective
Define cloud infrastructure configurations (Infrastructure as Code via Terraform) to deploy microservices onto AWS Elastic Container Service (ECS Fargate), Elastic Container Registry (ECR), Application Load Balancers (ALB), and S3/CloudFront for static frontend hosting.

## Terraform Provisioning Steps
```bash
# Initialize Terraform AWS Provider
terraform init

# Validate syntax and plan execution
terraform plan -out=tfplan

# Apply infrastructure provision
terraform apply tfplan
```

## ECS Task Definition Overview
`aws-ecs-task-definition.json` specifies container images, CPU (0.5 vCPU), Memory (1024MB), container port mappings (8080/8090), and AWS CloudWatch logging streams.
