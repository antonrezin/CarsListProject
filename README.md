# Cars List Project

The **Cars List** project is built with **Java Spring Boot** and an H2 in-memory database. It allows users to **view**, **add**, **edit**, and **delete** car entries, including details such as **Brand**, **Model**, **Year**, **Engine**, **Horsepower (HP)**, **Price**, and **Color**. The project also includes **user authentication** with **Spring Security 6**, enabling users to log in, register, and access features based on their role.

## User Roles:

- **Admin**: Can add, edit, and delete cars.
- **Normal User**: Can add and edit cars but cannot delete cars.

## Tech Stack:

- **Java Spring Boot**: Backend framework.
- **Spring Web**: Handles web requests.
- **Spring MVC**: Manages web pages.
- **Thymeleaf**: For frontend rendering.
- **Spring Data JPA**: For database interaction.
- **H2 Database**: In-memory database.
- **Spring Security 6**: Handles authentication and authorization.
- **Spring Validation**: For input validation.

## Features:

- **View Cars**: Displays a list of cars with options to edit or delete (Admin only).
- **Add Car**: A form to add a new car with validation.
- **Edit Car**: A form to edit car details, available to both Admin and Normal Users.
- **Delete Car**: Admin-only feature to delete cars.
- **User Authentication**: Login with:
  - **Admin**: `username: admin`, `password: admin` (Full access).
  - **Normal User**: `username: user`, `password: user` (Limited access).
- **Sign-Up**: New users can create an account via `/signup`.
- **Input Validation**: Ensures valid data when adding/editing cars and registering.

## IDE Setup:

### VSCode:

1. Install the **Java Extension Pack** and **Spring Boot Dashboard** extensions.
2. Open the project and run it using the installed Spring Boot Dashboard.

### IntelliJ IDEA:

1. Open the project and run it using the **Spring Boot** configuration.

### Eclipse:

1. Import the project as a **Maven Project** and run it as a **Spring Boot App**.

## Setup:

1. **Clone the repository**:

   ```bash
   git clone https://github.com/antonrezin/CarsListProject.git
   ```

2. **Navigate to the project directory**:

   ```bash
   cd CarsListProject
   ```

3. **Run the application** in your chosen IDE, following the instructions for different IDEs listed above.

4. Visit `http://localhost:8080` after successfully running the app to see it in action.

## Database Setup:

### H2 Console Access:

1. Run the application following the instructions above.
2. Go to `http://localhost:8080/h2-console`.
3. Use the following credentials:
   - **JDBC URL**: `jdbc:h2:mem:testdb`
   - **Username**: `sa`
   - **Password**: Leave empty.

## Endpoints:

- **`/login`**: Login page for user authentication.
- **`/cars`**: Displays a list of all cars (Admin and Normal User).
- **`/addcars`**: Form to add a new car (Login required).
- **`/editcars`**: Form to edit car details (Admin and Normal Users).
- **`/signup`**: Register new users.

## How to Use:

1. **Login**:
   - Use **Admin** or **Normal User** credentials. New users can sign up via `/signup`.

2. **View, Add, and Edit Cars**:
   - After logging in, you can view cars at `/cars`, add new cars via `/addcars`, and edit existing cars.

3. **Delete a Car**:
   - Only Admins can delete cars.
