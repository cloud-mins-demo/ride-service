# Project Title

Ride Service (Dummy Tech Stack Extractor App)

## Overview

This repository contains a dummy ride-service application used to test and validate a GitHub tech stack extractor. The codebase is intentionally simple and predictable so tooling can reliably detect technologies, project layout, and common development workflows.

## Features

- Lightweight Spring Boot service for ride-related API testing.
- Simple REST endpoint for deterministic extraction and parsing checks.
- Container-friendly setup for consistent local and CI execution.
- Clean repository structure designed for automated scanning tools.
- Extensible placeholder architecture for adding more stack components.

## Tech Stack

- Frontend
	- React
- Backend
	- Java 17
	- Spring Boot
	- Node.js
	- Python
	- FastAPI
- Database
	- PostgreSQL
- DevOps
	- Docker
	- AWS
	- GitHub Actions
- Testing
	- JUnit 5
	- Pytest

## Project Structure

```text
.
|-- Dockerfile
|-- pom.xml
|-- README.md
`-- src
		`-- main
				|-- java
				|   `-- com
				|       `-- app
				|           `-- ride
				|               |-- RideApplication.java
				|               |-- controller
				|               |   `-- RideController.java
				|               |-- repository
				|               |   `-- RideRepository.java
				|               `-- service
				|                   `-- RideService.java
				`-- resources
						`-- application.yml
```

## Installation

1. Clone the repository.
2. Ensure Java 17+ and Maven are installed.
3. (Optional) Start supporting services such as PostgreSQL via Docker.
4. Build the project:

```bash
mvn clean install
```

## Usage

Run the service locally:

```bash
mvn spring-boot:run
```

Default local URL:

```text
http://localhost:8080
```

## API Endpoints

- `GET /rides` - Returns a simple rides response from the service layer.

Example request:

```bash
curl http://localhost:8080/rides
```

## Environment Variables

Typical variables (when configured in `application.yml` or deployment settings):

- `SERVER_PORT` - Application port (default: `8080`).
- `SPRING_DATASOURCE_URL` - PostgreSQL JDBC connection URL.
- `SPRING_DATASOURCE_USERNAME` - Database username.
- `SPRING_DATASOURCE_PASSWORD` - Database password.
- `SPRING_PROFILES_ACTIVE` - Active runtime profile (for example: `local`, `dev`, `test`).

## Testing

Run Java tests:

```bash
mvn test
```

This dummy project is intended for stack detection validation, so test coverage may be minimal and expanded over time.

## Roadmap

- Add more REST endpoints to simulate realistic ride workflows.
- Add integration tests with PostgreSQL and containerized test environments.
- Add CI checks for build, test, and lint workflows.
- Add optional companion services (Node.js and FastAPI) for multi-stack extraction scenarios.

## License

This project is provided for internal testing and evaluation purposes. Add a formal license file (for example, MIT) if open-source distribution is planned.