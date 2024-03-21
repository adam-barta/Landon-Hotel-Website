# Landon Hotel Website

## Overview

This project implements multithreaded, object-oriented code. It also explores deployment of software applications using cloud services and Docker containers.

## Features

- **Multithreading**: Utilizes Java's multithreading capabilities to enhance performance and concurrency handling.

- **Object-Oriented Design**: Adheres to object-oriented principles to promote code reusability, maintainability, and scalability.

- **Cloud Deployment**: Explores deployment options for software applications using Docker and cloud services, enabling scalability, reliability, and flexibility.

## Installation and Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/adam-barta/D387-PA
   ```

2. **Navigate to the Project Directory**:
   ```bash
   cd D387-PA
   ```

3. **Run Spring Boot back-end in IDE**: `src/main/java/edu/wgu/d387_sample_code/D387SampleCodeApplication.java`

4. **Run front-end**:
```bash
cd src/main/UI
npm install
ng serve
```

## Docker Deployment

- Package project as .jar using Maven build tools.
- Build Docker image using provided Dockerfile.
- Run Docker image in container.

## Usage

- Once the application is running, access the front-end interface at http://localhost:4200/.
