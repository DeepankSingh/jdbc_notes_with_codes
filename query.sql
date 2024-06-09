-- Step 1: Create Database
CREATE DATABASE test;

-- Step 2: Create the Employee table
CREATE TABLE Employee (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(100),
    PhoneNumber VARCHAR(20),
    HireDate DATE,
    JobTitle VARCHAR(50),
    Salary DECIMAL(10, 2),
    Department VARCHAR(50)
);

-- Step 3: Insert sample data into the Employee table
INSERT INTO Employee (EmployeeID, FirstName, LastName, Email, PhoneNumber, HireDate, JobTitle, Salary, Department) VALUES
(1, 'John', 'Doe', 'john.doe@example.com', '555-1234', '2020-01-15', 'Software Engineer', 80000.00, 'Engineering'),
(2, 'Jane', 'Smith', 'jane.smith@example.com', '555-5678', '2019-03-22', 'Product Manager', 90000.00, 'Product'),
(3, 'Alice', 'Johnson', 'alice.johnson@example.com', '555-8765', '2021-07-10', 'Data Analyst', 70000.00, 'Data'),
(4, 'Bob', 'Brown', 'bob.brown@example.com', '555-4321', '2018-10-30', 'HR Specialist', 60000.00, 'HR'),
(5, 'Charlie', 'Davis', 'charlie.davis@example.com', '555-1357', '2022-05-05', 'Sales Representative', 65000.00, 'Sales');
