# microservice-cards

Card service in my microservices system (work in progress).

## Overview
`microservice-cards` focuses on card-related functionality (card information, status, and operations) as part of my microservices ecosystem.

The project is still under development, so names, endpoints, and infrastructure may change.

## Current Status
- Active development (WIP)

## Current Tech Stack (so far)
- Java

## Planned / Future Tech Stack (will be added progressively)
Target architecture and tooling for this service includes:
- **Spring Boot** REST API
- **Spring Data JPA** + database per service
- **Centralized/externalized configuration**
- **Service discovery** for internal communication
- **API Gateway** for routing and shared concerns
- **Resilience patterns** (circuit breaker/retry/timeouts)
- **Observability** (metrics/logs/traces)
- **Security** (OAuth2 / OIDC approach)
- **Docker** container images + **Docker Compose** for local environment
- **Kubernetes** deployments (later) + **Helm**
- Optional: **async messaging/event-driven flows** (later)

## How to Run
This will be updated with exact commands once the build and runtime approach is finalized.

Typical local workflow targets:
- Run service locally from IDE
- Run service + dependencies using Docker Compose
- Run the whole system via gateway

## API Docs
- Run the project and go to this link to open Swagger/ OpenAPI docs: http://localhost:9000/swagger-ui/index.html

## Project Approach / Plan
1. Build the domain model and REST endpoints
2. Add validation + error handling standards
3. Add persistence + migrations
4. Integrate with other services via gateway/service discovery
5. Add resilience, observability, and security
6. Package and deploy with containers (Compose → Kubernetes)

## Related Repositories
- `microservice-accounts`
- `microservice-loans`

## Notes
Starter README for now—will be expanded later with real endpoints, diagrams, and run instructions.
