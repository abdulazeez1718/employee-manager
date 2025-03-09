# employee-manager
# 🚀 Employee Manager API

Welcome to the **Employee Manager API**! This is a simple yet powerful RESTful API built using **Spring Boot** and **PostgreSQL**. The project is part of my journey into mastering the **Spring Framework** and SQL database integration. 💡

## 📌 Features

✅ CRUD operations for employee management 👨‍💼👩‍💼  
✅ RESTful API with structured endpoints 🌍  
✅ Spring Boot with JPA & Hibernate 🔥  
✅ PostgreSQL database integration 🗄️  
✅ Exception handling & logging 📜  
✅ Docker support for deployment 🐳  
✅ Postman collection for API testing 🛠️  

## 🎯 Technologies Used

- **Spring Boot** - Backend framework
- **Spring Data JPA** - ORM for database interactions
- **PostgreSQL** - Relational database
- **Lombok** - Boilerplate code reduction
- **Docker** - Containerized deployment
- **Swagger** - API documentation

## 📂 Project Structure

```
com.azeez
├── exception
│   ├── UserNotFoundException.java    # Custom exception handling
├── model
│   ├── Employee.java                 # Employee entity class
├── repository
│   ├── EmployeeRepo.java             # Repository interface for DB operations
├── service
│   ├── EmployeeManagerApplication.java  # Main Spring Boot application
│   ├── EmployeeResource.java         # REST Controller for employee endpoints
```

## 🚀 Getting Started

### 1️⃣ Clone the Repository
```sh
git clone https://github.com/yourusername/employeemanager.git
cd employeemanager
```

### 2️⃣ Configure Database (PostgreSQL)
Update `src/main/resources/application.properties` with your database credentials:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/employeedb
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 3️⃣ Build and Run the Project
```sh
mvn clean install
mvn spring-boot:run
```


## 📜 Learnings & Takeaways
- Setting up a **Spring Boot** project from scratch 🔨
- Implementing **REST APIs** with best practices ✅
- Connecting **Spring Boot with PostgreSQL** 🗄️
- Using **JPA & Hibernate** for data persistence 📦
- Handling exceptions gracefully 🛡️
- Creating **Dockerized applications** 🐳

## 🤝 Contributing
Feel free to fork this repository, submit issues, and make pull requests! Let's build and learn together. 🚀

## 📬 Connect with Me
- LinkedIn: 
- Twitter: 
- GitHub: 

---

🌟 **If you like this project, give it a star!** ⭐ Happy Coding! 🚀

