# Student Service (MongoDB)

This project is a Spring Boot application that manages student data with a MongoDB backend. It allows operations
to create, read, update, and delete student information.

## Getting Started

Ensure you have the following requirements installed on your computer to run this project successfully:

- JDK 17
- Docker

### Running the Project

Follow these steps to get your application up and running:

1. Ensure Docker is running.

2. Run the `Student Service (MongoDB)` application.

### Usage

1. **Creating a student:**
    - Send a `POST` request to `/api/v1/students` with a JSON body containing the new student information.

2. **Retrieving all students:**
    - Send a `GET` request to `/api/v1/students` to fetch a list of all registered students.

3. **Updating a student:**
    - Send a `PUT` request to `/api/v1/students` with a JSON body that includes the updated student information.
      Make sure to include the student's ID in the request body.

4. **Deleting a student:**
    - Send a `DELETE` request to `/api/v1/students/{id}`, where `{id}` is the ID of the student you want to delete.