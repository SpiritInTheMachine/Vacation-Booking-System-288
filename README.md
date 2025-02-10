# Vacation Booking System

## Overview
The **Vacation Booking System** is a full-stack web application designed to facilitate vacation package bookings, user checkout, and order management. This project modernizes the backend using **Spring Boot**, replacing a legacy system while integrating with an **Angular** frontend and a **MySQL** database for data persistence.

## Features
- **Vacation Package Management** – View and manage vacation offerings and excursions.
- **User Checkout** – Secure order placement with real-time database updates.
- **Order Tracking** – Track vacation bookings and manage order statuses.
- **Database Persistence** – MySQL-backed data storage with JPA & Hibernate ORM.
- **RESTful API** – Exposes endpoints for seamless integration with the front end.

## Technologies Used
### **Backend:**
- **Spring Boot** – REST API development
- **Java** – Core application logic
- **Spring Data JPA** – ORM for database interactions
- **MySQL** – Relational database for structured data storage
- **Hibernate** – Persistence framework for object-relational mapping

### **Frontend:**
- **Angular** – Dynamic and responsive user interface
- **TypeScript** – Strongly-typed JavaScript for front-end development
- **Bootstrap** – Styling and UI components

### **Development & Deployment:**
- **IntelliJ IDEA** – Development environment
- **GitLab** – Version control and repository hosting
- **Maven** – Dependency management and build automation
- **Docker** (Optional) – Containerized deployment

## Project Structure
```
 vacation-booking-system/
 ├── src/
 │   ├── main/java/com/example/demo/
 │   │   ├── controllers/    # REST controllers
 │   │   ├── entities/       # JPA entity classes
 │   │   ├── dao/            # Repository interfaces
 │   │   ├── services/       # Business logic layer
 │   │   ├── config/         # Configuration files
 │   ├── resources/
 │   │   ├── application.properties  # Database & app settings
 ├── pom.xml  # Maven dependencies
 ├── README.md  # Project documentation
```

## Installation & Setup
### Prerequisites
- Java 17+
- Maven
- MySQL Server
- Node.js & Angular CLI (for front-end)

### Backend Setup
1. Clone the repository:
   ```sh
   git clone https://gitlab.com/your-repository-link.git
   cd vacation-booking-system
   ```
2. Configure MySQL in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/vacation_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```
3. Build and run the application:
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

### Frontend Setup
1. Navigate to the Angular frontend directory:
   ```sh
   cd frontend
   ```
2. Install dependencies:
   ```sh
   npm install
   ```
3. Run the development server:
   ```sh
   ng serve
   ```

## API Endpoints
| Endpoint | Method | Description |
|----------|--------|-------------|
| `/api/vacations` | GET | Get all vacation packages |
| `/api/cart` | POST | Add an item to the cart |
| `/api/orders` | POST | Place an order |
| `/api/orders/{id}` | GET | Retrieve order details |

## Future Enhancements
- **User Authentication** – Implement JWT-based authentication.
- **Payment Integration** – Integrate third-party payment gateways.
- **Admin Dashboard** – Provide an interface for managing vacations and bookings.

---
