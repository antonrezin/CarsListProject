# Cars List Project

This project is a Cars List built with Java Spring Boot and an H2 in-memory database. It allows users to view, add, edit, and delete car entries with details like Brand, Model, Year, Engine, Horsepower (HP), Price, and Color.

## Tech Stack

- **Java Spring Boot**: The backend framework.
- **Spring Web**: For handling web requests.
- **Spring MVC**: For managing web pages.
- **Thymeleaf**: For rendering the frontend.
- **Spring Data JPA**: For database operations.
- **H2 Database**: An in-memory database to store car data.

## Features

- **View Cars**: The `/cars` page shows a list of cars with details and options to edit or delete them.
- **Add Car**: The `/addcars` page lets users add a new car to the list.
- **Edit Car**: The `/editcars` page allows users to edit an existing car’s details.
- **Delete Car**: The `Delete` button removes a car from the list.
- **Cancel Buttons**: On the `/addcars` and `/editcars` pages, clicking Cancel takes the user back to the cars list.

## Database

The project uses an H2 in-memory database, which is already set up and ready to use.

### Accessing the H2 Console

1. Go to `http://localhost:8080/h2-console`.
2. Use these settings:
   - JDBC URL: `jdbc:h2:mem:testdb`
   - Username: sa
   - Password: Leave empty.

This allows you to view and manage the database.

## Endpoints

### `/cars`
Shows the list of cars with options to edit or delete each.

### `/addcars`
Shows a form to add a new car.

### `/editcars`
Shows a form to edit an existing car’s details.

## Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/antonrezin/CarsListProject.git
   ```

2. **Navigate to the project directory:**
   ```bash
   cd CarsListProject
   ```

3. **Run the application:**
   ```bash
   ./mvnw spring-boot:run
   ```

4. Open your browser and go to `http://localhost:8080/cars` to view the application.

## IDE Setup Instructions

### VSCode

1. **Install Java Extensions**:
   - Open VSCode.
   - Install the **Java Extension Pack**.

2. **Install Spring Boot Dashboard Extension**:
   - Go to Extensions (`Ctrl+Shift+X`).
   - Search for **Spring Boot Dashboard** and install it.

3. **Open the Project**:
   - Select **File > Open Folder** and choose the project folder.

4. **Install Maven**:
   - If you don't have Maven, install it by running `mvn -v` in the terminal.

5. **Run the Application**:
   - Open the Spring Boot Dashboard and click **Run**.

6. **Open the App**:
   - Go to `http://localhost:8080/cars` to view the app.

### IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Select **File > Open** and choose the project folder.
3. IntelliJ will detect the Maven project and download the dependencies.
4. Click **Run > Run 'CarsListProject'** to start the app.

### Eclipse

1. Open Eclipse.
2. Select **File > Import**.
3. Choose **Maven > Existing Maven Projects** and click **Next**.
4. Select the project folder and click **Finish**.
5. Right-click the project and select **Run As > Spring Boot App**.

## How to Use

1. **View Cars**:
   Go to `/cars` to see the list of cars.

2. **Add a Car**:
   Click the "Add Car" button to go to the `/addcars` page and add a new car.

3. **Edit a Car**:
   Click "Edit" next to a car to change its details.

4. **Delete a Car**:
   Click "Delete" next to a car to remove it from the list.

5. **Cancel Operations**:
   If adding or editing a car, you can cancel and return to the list by clicking the "Cancel" button.
   
