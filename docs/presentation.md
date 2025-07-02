Expense Tracker – Spring Boot Application (Java 21)

🧠 Approach & Design
- Modular Architecture: The application follows a clean separation of concerns using layers:
- model for domain objects
- repository for data access
- service for business logic
- controller for exposing REST APIs
- RESTful Design: Exposes consistent and predictable HTTP endpoints for interaction
- H2 Embedded DB: Quick bootstrapping with preloaded seed data (data.sql)
- Ready for Cloud: Can be deployed on platforms like Railway, Render, or AWS Beanstalk

📁 Key Files & Folders
| Path | Purpose |
| ExpenseTrackerApp.java | Application entry point |
| controller/ExpenseController.java | Maps HTTP requests to service actions |
| service/ExpenseService.java | Manages business logic for summaries & persistence |
| repository/ExpenseRepository.java | Data access interface extending JPA |
| model/Expense.java | Entity class representing an expense |
| resources/application.properties | DB config and H2 console setup |
| resources/data.sql | Seed data loaded on app startup |
| README.md & presentation.md | Project overview, usage, and deployment notes |



⚙️ Process to Run, Test & Verify
🏃 Run the App
mvn spring-boot:run


Or build the JAR and run:
mvn clean package
java -jar target/expense-tracker-1.0.0.jar


🔍 Test Endpoints (via Postman/cURL)
- GET /api/expenses: Lists all expenses
- POST /api/expenses: Add new expense
- GET /api/expenses/summary: Total by category
