# Pokémon API - Spring Boot Project

This project is a simple **RESTful API** built with **Spring Boot** using **Kotlin** that provides information about Pokémon.

## Features

- **Spring Boot 3.4.4** and **Kotlin**.
- Exposes two endpoints:
    - `GET /api/pokemon`: Get a list of all Pokémon.
    - `GET /api/pokemon/{id}`: Get details of a specific Pokémon by ID.

## Prerequisites

Make sure you have the following installed on your machine:

- **Java 17** (or higher)
- **Gradle**
- **Git**
- **IntelliJ IDEA** (or another Kotlin-compatible IDE)

## How to Run:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/DanielM3218/pokemon-rest-api.git
   cd pokemon-api-final
   ```

2. **Build the project using Gradle:**
   ```bash
   ./gradlew build
   ```

3. **Run the application:**
   ```bash
   ./gradlew bootRun
   ```

   The application will run on `http://localhost:8080`.

## API Endpoints

- **GET /api/pokemon**: Get a list of all Pokémon.
- **GET /api/pokemon/{id}**: Get a specific Pokémon by ID (replace `{id}` with the Pokémon ID).

Example using **cURL** to get all Pokémon:
```bash
curl http://localhost:8080/api/pokemon
