import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Student Class
class Student {
    private int rollNumber;
    private String name;
    private String course;
    private int marks;
    private char grade;

    // Constructor
    public Student(int rollNumber, String name, String course, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        this.marks = marks;
        this.grade = calculateGrade();
    }

    // Grade Calculation Logic
    private char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }

    // Display student details
    public void display() {
        System.out.println("--------------------------------------");
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Course      : " + course);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + grade);
        System.out.println("--------------------------------------");
    }
}


// Student Record Manager Class
class StudentRecordManager {
    private List<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Add a new student
    public void addStudent() {
        System.out.print("Enter Roll Number: ");
        int roll = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Marks (0-100): ");
        int marks = scanner.nextInt();

        // Create object
        Student s = new Student(roll, name, course, marks);
        students.add(s);

        System.out.println("Student added successfully!");
    }

    // Display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records available!");
        } else {
            System.out.println("\n===== Student Records =====");
            for (Student s : students) {
                s.display();
            }
        }
    }

    // Main Menu
    public void menu() {
        int choice;

        do {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> displayStudents();
                case 3 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 3);
    }
}


// Main Class
public class StudentRecordManagementSystem {
    public static void main(String[] args) {
        StudentRecordManager manager = new StudentRecordManager();
        manager.menu();
    }
}
