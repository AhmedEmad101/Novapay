# 💳 NovaPay

NovaPay is an enterprise-grade fintech backend application built with **Spring Boot**. The project demonstrates modern backend development practices including authentication, payment processing, clean architecture, and design patterns.

The goal of NovaPay is to simulate a real-world digital payment platform that supports multiple payment providers, secure user authentication, and extensible payment processing.

---

## 🚀 Features

### Authentication
- User Registration
- JWT Authentication
- BCrypt Password Encryption
- Spring Security Integration

### User Management
- User Registration
- Secure Password Storage
- Phone Number Support
- Email Validation

### Payment Processing
- Multiple Payment Providers
- Multiple Payment Methods
- Strategy Pattern Implementation
- Extensible Payment Architecture

### Payment Companies
- Manage Payment Providers
- Active / Inactive Providers

### Branch Management
- Branch Registration
- Company Association
- Geographic Coordinates

---

## 🏗️ Project Architecture

The project follows a layered architecture:

```
Controller
    ↓
Service
    ↓
Repository
    ↓
Database
```

Business logic is separated from controllers, making the application clean, maintainable, and scalable.

---

## 📂 Project Structure

```
src/main/java/com/example/novapay

├── auth
├── branch
├── config
├── contracts
├── payment
├── paymentcompany
├── paymentstrategies
├── security
├── user
└── enums
```

---

## 🛠 Technologies

- Java 21
- Spring Boot 3
- Spring Security
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok
- JWT (JSON Web Tokens)
- BCrypt
- Hibernate

---

## 🎯 Design Patterns

NovaPay demonstrates several enterprise software design principles:

- Strategy Pattern
- Dependency Injection
- Repository Pattern
- Builder Pattern
- DTO Pattern
- Layered Architecture

---

## 🔐 Authentication

Authentication is implemented using JWT.

Workflow:

```
Register
      ↓
Login
      ↓
Generate JWT
      ↓
Protected APIs
```

Passwords are encrypted using BCrypt before storage.

---

## 💰 Payment Processing

The payment module is designed to support multiple providers.

Example providers:

- Vodafone Cash
- Aman
- Fawry *(planned)*
- Stripe *(planned)*
- PayPal *(planned)*

Each provider implements its own payment strategy, making the system open for extension while remaining closed for modification.

---

## 📌 Current Features

- User Entity
- Payment Entity
- Payment Company Entity
- Branch Entity
- JWT Authentication
- Login
- Registration
- Payment Strategy
- PostgreSQL Integration

---

## 🚧 Planned Features

- Wallet System
- Transaction History
- Account Balance
- Refresh Tokens
- Role-Based Authorization
- Swagger Documentation
- Redis Caching
- Docker Support
- Email Notifications
- Payment Gateway Simulation
- Transaction Audit Logs
- Unit Testing
- Integration Testing
- CI/CD Pipeline
- Microservices Migration

---

## 📖 Learning Objectives

This project was built to explore enterprise Java backend development and modern Spring Boot architecture.

Topics covered include:

- Spring Boot
- Spring Security
- JWT Authentication
- REST APIs
- Hibernate/JPA
- PostgreSQL
- Design Patterns
- Clean Architecture

---

## 👨‍💻 Author

Ahmed Emad

Backend Developer
LinkedIn:(https://www.linkedin.com/in/ahmed-emad-492a4a22b/)

---
