provider "aws" {
  region = var.aws_region
}

# VPC Configuration
resource "aws_vpc" "app_vpc" {
  cidr_block           = "10.0.0.0/16"
  enable_dns_hostnames = true
  enable_dns_support   = true

  tags = {
    Name        = "java-fse-vpc"
    Environment = var.environment
  }
}

# Public Subnets
resource "aws_subnet" "public_subnet_1" {
  vpc_id                  = aws_vpc.app_vpc.id
  cidr_block              = "10.0.1.0/24"
  availability_zone       = "${var.aws_region}a"
  map_public_ip_on_launch = true

  tags = { Name = "public-subnet-1" }
}

# Internet Gateway
resource "aws_internet_gateway" "igw" {
  vpc_id = aws_vpc.app_vpc.id
  tags   = { Name = "app-igw" }
}

# ECS Cluster
resource "aws_ecs_cluster" "main_cluster" {
  name = "java-fse-ecs-cluster"

  tags = {
    Environment = var.environment
  }
}

# Application Load Balancer
resource "aws_lb" "app_alb" {
  name               = "java-fse-alb"
  internal           = false
  load_balancer_type = "application"
  subnets            = [aws_subnet.public_subnet_1.id]

  tags = { Environment = var.environment }
}
