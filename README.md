# Student Library Management System

A complete desktop-based Library Management System built using Core Java and MySQL.

## Features
- User Registration & Login (Admin + Student)
- Add / Search / Issue / Return Books
- Automatic fine calculation (₹5 per day after due date)
- View all issued books & history

## Tech Stack
- Java 8
- MySQL
- JDBC Connectivity
- Swing (for GUI, if you used it) or Console-based

## Database Setup
- Database name: `library_db`
- Tables: 
  - users (id, username, password, role)
  - books (id, title, author, quantity)
  - issues (id, user_id, book_id, issue_date, due_date, fine)

## How to Run
1. Install MySQL and create database `library_db`.
2. Run SQL queries to create tables (add your SQL code here if you have).
3. Update JDBC connection details in code (URL, username, password).
4. Compile and run `Main.java` using Java compiler.

## Screenshots (optional)
(If you have project screenshots, upload & add here like ![screenshot](screenshot.png))

Developed by Uniesh R | OCA Java Certified | Contact: unieshr2107@gmail.com
