# Expense Tracker – Spring Boot (Java 21)

A lightweight, modular, and RESTful expense management system built with Spring Boot 3.x and Java 21. Designed for scalability, testability, and quick deployment to cloud platforms such as Render, Railway, and AWS.

---

## Features

- Add, view, and list expenses
- Aggregate expense totals by category
- View seed/demo data on startup
- RESTful API with JSON responses
- Embedded H2 database (can swap for PostgreSQL)
- Easily deployable anywhere Java runs

---

## Tech Stack

| Layer       | Technology          |
|------------|----------------------|
| Language    | Java 21              |
| Framework   | Spring Boot 3.2+     |
| Data Layer  | Spring Data JPA      |
| Database    | H2 (in-memory)       |
| Build Tool  | Maven                |
| API Docs    | Swagger (Optional)   |

---

##  Getting Started

###  Prerequisites

- Java 21
- Maven 3.8+
- Git

### Run Locally

```bash
git clone https://github.com/your-username/expense-tracker-springboot.git
cd expense-tracker-springboot
mvn spring-boot:run

