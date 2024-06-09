# JDBC Example with PostgreSQL

This repository contains an example of using JDBC (Java Database Connectivity) with PostgreSQL. The example demonstrates how to connect to a PostgreSQL database, execute a simple SQL query, and handle the result set.

## Contents

- `JDBCSteps.java`: Java code demonstrating the use of JDBC.
- `Query.sql`: SQL script to set up the PostgreSQL database and populate it with sample data.

## Prerequisites

- Java Development Kit (JDK) installed.
- PostgreSQL database installed.
- IntelliJ IDEA or any other Java IDE.

## Steps to Setup and Run

### Step 1: Create the Database

1. Open your PostgreSQL client (e.g., pgAdmin, psql).
2. Execute the SQL commands in `Query.sql` to create the database and the `Employee` table, and to insert sample data.


### Step 2: Add Libraries

1. Download postgres driver -> "https://jdbc.postgresql.org/download/"
2. After download you have to load the jar file to libraries
   
steps to load the libraries:
go to file > project structure > libraries > +(icon) > java
now select the downloaded jar file 
to verify you can see in intelije inside the Libraries there will be you jar file


