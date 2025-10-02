# Bakery Cart Service

## Overview
Manages user shopping cart, supports adding/removing products, cart updates, and pricing.

## Features
- Cart item management per user session
- Real-time product availability checks
- Cart persistence in Redis or database

## Dependencies
- Spring WebFlux
- Spring Data Redis
- Spring Data JPA
- Spring Boot Actuator

## Key Endpoints
- `/api/cart/{userId}/items` (GET, POST, DELETE)
- `/api/cart/{userId}/checkout`

## Running
./gradlew bootRun

Runs on port 8082 by default.

## Documentation
Swagger UI: `http://localhost:8082/swagger-ui.html`

---
