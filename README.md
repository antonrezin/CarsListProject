# Car List Project

This is a Car List Project built using Java Spring Boot, featuring H2 Database for data storage, and Spring Web for building the web application. The project allows users to view, add, edit, and delete car entries with details such as Brand, Model, Year, Body, Engine, Horsepower (HP), Price, and Color. The application provides a simple, user-friendly interface for managing a list of cars.

## Features

- **View Cars**: The `/cars` endpoint displays a list of cars with the following details:
  - Brand
  - Model
  - Year
  - Body
  - Engine
  - Horsepower (HP)
  - Price
  - Color
  - Actions (Edit and Delete buttons)

- **Add Car**: The `/addcars` endpoint allows users to add a new car to the list with all required details. After saving, the new car entry appears on the `/cars` page.
  
- **Edit Car**: The `/editcars` endpoint allows users to edit the details of an existing car. After updating, the user can save the changes, which are then reflected on the `/cars` endpoint.
  
- **Delete Car**: The `Delete` button allows users to delete a car entry from the list. Once deleted, the car information is permanently removed.

- **Cancel Buttons**: Both the `/addcars` and `/editcars` pages feature a Cancel button, which will cancel the operation (adding or editing a car) and redirect the user back to the `/cars` endpoint.

## Endpoints

### `/cars`
Displays a list of cars with their details and actions:
- **Edit**: Redirects to `/editcars` where the car details can be updated.
- **Delete**: Deletes the car from the list.

### `/addcars`
Displays a form to add a new car with all the necessary details. After saving, the car is added to the `/cars` list.

### `/editcars`
Displays a form to edit an existing car's details. After saving, the car's information is updated on the `/cars` page.

### `/cancel`
Redirects the user back to the `/cars` page if the user decides to cancel the current operation (add or edit).

## Tech Stack

- **Java Spring Boot**: The backend framework used to build the application.
- **Spring Web**: For handling HTTP requests and building the web application.
- **Spring MVC**: For managing web requests and serving dynamic pages.
- **Thymeleaf**: For rendering the frontend templates.
- **Spring Data JPA**: For interacting with the database to store and retrieve car entries.
- **H2 Database**: An in-memory database used for storing car information during runtime.

## Setup

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   ```

2. **Navigate to the project directory:**
   ```bash
   cd CarListProject
   ```

3. **Build the application:**
   ```bash
   ./mvnw clean install
   ```

4. **Run the application:**
   ```bash
   ./mvnw spring-boot:run
   ```

5. Open your browser and navigate to `http://localhost:8080/cars` to view the application.

## How to Use

### 1. **View Cars**:
- Access the `/cars` endpoint to view the list of cars.

### 2. **Add a Car**:
- Click the "Add Car" button to navigate to the `/addcars` page and enter details for a new car.

### 3. **Edit a Car**:
- Click the "Edit" button next to any car to update its information.

### 4. **Delete a Car**:
- Click the "Delete" button next to any car to remove it from the list.

### 5. **Cancel Operations**:
- If you are adding or editing a car, you can cancel the operation and return to the car list by clicking the "Cancel" button.
