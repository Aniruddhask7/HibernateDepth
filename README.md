# HibernateDepth

## 📌 Project Overview

HibernateDepth is a Java-based Spring Boot application developed to understand and implement Hibernate ORM (Object-Relational Mapping) concepts. This project demonstrates how to perform CRUD operations using Hibernate and EntityManager.

The application manages student records and demonstrates database interaction using Java, Spring Boot, and Hibernate.

## 🚀 Technologies Used

- Java
- Spring Boot
- Hibernate ORM
- JPA (Java Persistence API)
- Maven
- SQL Database
- IntelliJ IDEA

## 📂 Project Structure

```text
HibernateDepth/
│
├── src/main/java/
│   └── com/example/hibernateDepth/
│       │
│       ├── controller/
│       │   └── Studentcontroller.java
│       │
│       ├── entity/
│       │   └── Student.java
│       │
│       ├── repository/
│       │   └── StudentRepository.java
│       │
│       ├── services/
│       │   └── StudentServices.java
│       │
│       └── HibernateDepthApplication.java
│
├── src/main/resources/
│   └── application.properties
│
├── pom.xml
└── README.md
```

## ⚙️ Features

- Add new student records
- Retrieve student by ID
- Retrieve all student records
- Update student details
- Delete student records
- Hibernate ORM integration
- EntityManager-based database operations
- JPQL query implementation
- Spring Boot application architecture

## 🧠 Hibernate Concepts Implemented

- Object-Relational Mapping (ORM)
- Entity mapping using annotations
- EntityManager
- `persist()`
- `find()`
- `createQuery()`
- `getResultList()`
- CRUD operations
- JPQL (Java Persistence Query Language)
- Repository layer
- Service layer
- Controller layer

## 🔄 Application Architecture

```text
Client
  |
  v
StudentController
  |
  v
StudentServices
  |
  v
StudentRepository
  |
  v
EntityManager
  |
  v
Hibernate ORM
  |
  v
Database
```

## 🛠️ Installation and Setup

### 1. Clone the repository

```bash
git clone https://github.com/Aniruddhaask7/HibernateDepth.git
```

### 2. Open the project

Open the cloned project in IntelliJ IDEA.

### 3. Configure the database

Update your `application.properties` file with your database configuration.

### 4. Run the application

Run the main class:

```text
HibernateDepthApplication.java
```

Or use Maven:

```bash
mvn spring-boot:run
```

## 📚 Learning Objectives

This project was created to practice and understand:

- Hibernate framework
- JPA fundamentals
- EntityManager operations
- CRUD implementation
- Database connectivity
- Spring Boot project structure
- Layered architecture

- GitHub: [Aniruddhask7](https://github.com/Aniruddhask7)
 

⭐ This project is part of my Java Full Stack Development learning journey.
