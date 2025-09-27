🎮 Gaming Club Backend System
📌 Overview

The Gaming Club Backend System is a backend application built with Spring Boot, Java 21, and MySQL.
It provides REST APIs for managing users, games, and events.
The project is integrated with Swagger UI for API documentation and testing.

🚀 Tech Stack

        ->Java 21

        ->Spring Boot (with embedded Tomcat server)

        ->MySQL (Relational Database)

        ->Swagger UI (API testing & documentation)

⚙️ Setup Instructions
1️⃣ Prerequisites

Make sure you have installed:

        ->Java 21

        ->MySQL Server

        ->Maven (if not bundled with your IDE)

        ->IDE such as IntelliJ IDEA or Eclipse

2️⃣ Steps to Run the Project

Clone the Repository

        git clone https://github.com/yourusername/gaming_club.git
        cd gaming_clubbackend


Configure Database

        ->Create a new MySQL database (default name: gamingdb).

        ->Or, change the database name in application.properties:

            spring.datasource.url=jdbc:mysql://localhost:3306/gamingdb
            spring.datasource.username=your_mysql_username
            spring.datasource.password=your_mysql_password


Build & Run the Application

        ->From IDE → Run as Java Application (Spring Boot main class).

        ->Or from terminal:

            mvn spring-boot:run


Access Swagger UI
        Open browser and go to:

        http://localhost:8080/swagger-ui/index.html

📖 Features

        ->User registration & management

        ->Game management

        ->Event scheduling

        ->RESTful API endpoints with Swagger UI

🛠️ Future Enhancements

        ->JWT-based authentication & authorization

        ->Cloud deployment (AWS/Heroku/Render)

        ->Frontend integration
