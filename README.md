# **Foodway - Recipe Sharing Web Application**

**Foodway** is a web application that allows users to share their food recipes, interact with others by liking and sharing content, and upload photos and videos. Built using **Spring Boot**, **Java**, **JPA (Java Persistence API)**, and **Thymeleaf**, **Foodway** is designed to be simple, scalable, and user-friendly.

---

### **Table of Contents**
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [System Architecture](#system-architecture)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)

---

## **Introduction**

The **Foodway** web application offers a platform for users to create, manage, and share their food recipes with a community. Users can register, log in, post recipes with photos and videos, and interact with others through likes and shares. Designed with simplicity and functionality in mind, **Foodway** aims to bring food enthusiasts together in a collaborative online space.

This application is built using:
- **Java** for backend logic and core functionality.
- **Spring Boot** for the application framework, handling HTTP requests and business logic.
- **Spring Data JPA** to manage database interactions.
- **Thymeleaf** for rendering dynamic frontend templates.
- **MySQL** for storing user data, recipes, and related media.
- **Maven** for dependency management and build automation.

---

## **Features**

- **User Registration**: Users can sign up with a username and password.
- **User Login**: Registered users can log in and access a personalized session.
- **Dashboard**: After login, users can view their dashboard, manage their recipes, and view posted content.
- **Recipe Management**: Users can post food recipes, including text, images, and videos.

---

## **Technologies Used**

- **Backend**: 
  - **Java**: For backend development and core application logic.
  - **Spring Boot**: To build RESTful APIs and manage application logic.
  - **Spring Data JPA**: To manage database interactions with MySQL using Java Persistence API (JPA).
  - **Spring Security**: For secure authentication and authorization.
  
- **Frontend**: 
  - **Thymeleaf**: As the templating engine for dynamic page rendering and connecting backend data with the frontend.
  - **HTML**: For structuring the web pages and user interfaces.
  - **CSS**: For styling the user interfaces, making the app responsive and visually appealing.
  - **JavaScript**: For interactivity and enhancing user experience on the client-side.

- **Database**: 
  - **MySQL**: For storing user credentials, recipe details, images, and videos.
  
- **Build Tool**: 
  - **Maven**: For managing dependencies, building, and running the project.

---

## **System Architecture**

### **Frontend Layer (HTML, CSS, JavaScript, Thymeleaf)**:
- The frontend is built with **HTML** for the structure, **CSS** for styling and responsiveness, and **JavaScript** for dynamic behavior and interactivity on the client side.
- **Thymeleaf** is used to dynamically render HTML content, allowing data from the backend to be injected into the frontend pages.

### **Backend Layer (Spring Boot & Java)**:
- **Spring Boot** and **Java** handle the core application logic, user authentication, and CRUD operations for recipes, user data, and interactions.
- **Spring Data JPA** is used to manage database interactions and persistence for the application.

---

## **Installation**

To set up the **Foodway** application locally, follow these steps:

### 1. **Clone the Repository**
   Clone the repository to your local machine:
   ```bash
   git clone https://github.com/Yashasv-G/Foodway.git
   cd Foodway
   ```

### 2. **Import into Eclipse or IntelliJ**
   - Open **Eclipse** or **IntelliJ**.
   - Import the project as a **Maven** project.

### 3. **Configure MySQL Database**
   - Ensure you have **MySQL** installed and running.
   - Create a new database:
     ```sql
     CREATE DATABASE foodway_db;
     ```

   - Update the database connection settings in the `application.properties` file:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/foodway_db
     spring.datasource.username=root
     spring.datasource.password=root
     spring.jpa.hibernate.ddl-auto=update
     ```

### 4. **Run the Application**
   - From the project directory, run the Spring Boot application:
     ```bash
     mvn spring-boot:run
     ```

   - The application should now be running at **http://localhost:8080**.

---

## **Usage**

Once the application is running, you can:

1. **Register a New Account**: Navigate to **/register** and fill out the form to create an account.
2. **Login**: Use the credentials you registered with to log in.
3. **Post a Recipe**: Once logged in, navigate to **/post-recipe** and submit a new recipe with details such as title, ingredients, steps, and optional media (images/videos).
4. **Like and Share Recipes**: Browse through the recipes, and interact by liking or sharing them.
5. **View Dashboard**: Once logged in, your dashboard will show a list of your posted recipes, as well as an option to view your favorite recipes.

---

## **Contributing**

We welcome contributions! Here's how you can contribute to **Foodway**:

1. **Fork the Repository**: Click the **Fork** button on GitHub.
2. **Clone Your Fork**:
   ```bash
   git clone https://github.com/your-username/Foodway.git
   cd Foodway
   ```
3. **Create a New Branch**:
   ```bash
   git checkout -b feature/YourFeature
   ```
4. **Make Changes**: Implement your feature or fix a bug.
5. **Commit Changes**:
   ```bash
   git commit -m 'Add some feature'
   ```
6. **Push to Your Branch**:
   ```bash
   git push origin feature/YourFeature
   ```
7. **Open a Pull Request**: Create a pull request for us to review your changes.

---

This updated version of the README removes **Phase 2** and focuses only on the current features in **Phase 1**. Let me know if you need any further adjustments!
