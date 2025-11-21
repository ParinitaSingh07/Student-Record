📘 Student Record Management System
----

A simple Java-based console application to manage student records using Object-Oriented Programming (OOP).

📌 Project Overview
---

The Student Record Management System allows users to:

Add student details

Display all stored student records

Calculate grade based on marks

Use OOP principles such as classes, objects, encapsulation, constructors, and methods

This program is designed for students learning Java fundamentals and class structures.

🛠️ Features
--
✔ Add Student Record

User can enter:

Roll Number

Student Name

Course

Marks (0–100)

✔ Automatic Grade Calculation

Grade is assigned based on the following criteria:

Marks Range	Grade
90–100	A
80–89	B
70–79	C
60–69	D
Below 60	F
✔ Display All Student Records

Shows a nicely formatted list of all students along with:

Roll Number

Name

Course

Marks

Grade

✔ Menu-Driven Program
--

Easy navigation with options:

Add Student

Display Students

Exit

🧩 Program Structure
1️⃣ Student Class

Represents each student containing:

rollNumber

name

course

marks

grade

Includes methods:

calculateGrade() – determines grade

display() – prints full student detail

2️⃣ StudentRecordManager Class

Responsible for:

Storing all student objects using an ArrayList

Adding new student

Displaying all students

3️⃣ Main Class

Runs the menu and handles user interaction.

EXAMPLE WORKFLOW
---
===== Student Record Management System =====
--- 

1. Add Student
2. Display All Students
3. Exit
Enter your choice: 1

Enter Roll Number: 101
Enter Name: John Doe
Enter Course: BCA
Enter Marks: 87
Student added successfully!

▶️ How to Run
Step 1: Save the file
-----
StudentRecordManagementSystem.java

Step 2: Compile
---
javac StudentRecordManagementSystem.java

Step 3: Run
---

java StudentRecordManagementSystem

AUTHOR
--
Parinita singh
btech cse core 
2401010252

