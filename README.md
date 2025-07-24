# Description
A simple Java console application that registers users by name and age. If a user is under 18, a custom exception is thrown and the error is logged to a file (`error.log`) with a timestamp.

# Components
- `exceptions.invalidAgeExceptions` — Custom exception for age validation  
- `models.User` — User data model  
- `services.UserService` — Business logic for user registration  
- `main.Main` — Application entry point, handles input and error logging  

# Purpose
- Demonstrate use of custom exceptions in Java  
- Implement file-based error logging  
- Practice basic OOP structure (Models, Services, Exceptions)  
- Learn exception handling with try-catch and BufferedWriter  

# Design Highlights
- Custom Exception: `invalidAgeExceptions` for age validation  
- Logging: Writes errors to `error.log` using `BufferedWriter` in append mode  
- Separation of Concerns: `models.User`, `services.UserService`, `exceptions.invalidAgeExceptions`  
- Time-stamped logs using `LocalDateTime.now()`

# Author
Name:Lokeshwaran M
Email:lokeshwaran.m@epssw.com
