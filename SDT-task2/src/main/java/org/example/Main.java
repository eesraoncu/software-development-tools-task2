package org.example;

import org.example.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addGradeToStudent();
                    break;
                case 3:
                    listStudents();
                    break;
                case 4:
                    findStudentById();
                    break;
                case 0:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n===== Student Management System =====");
        System.out.println("1. Add Student");
        System.out.println("2. Add Grade to Student");
        System.out.println("3. List All Students");
        System.out.println("4. Find Student by ID");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addStudent() {
        System.out.print("Enter student name: ");
        scanner.nextLine(); // consume newline
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        students.add(new Student(name, id));
        System.out.println("Student added successfully!");
    }

    private static void addGradeToStudent() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        Student student = findStudentObject(id);

        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.print("Enter grade: ");
        double grade = scanner.nextDouble();

        student.addGrade(grade);
        System.out.println("Grade added successfully!");
    }

    private static void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : students) {
            s.printDetails();
        }
    }

    private static void findStudentById() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        Student student = findStudentObject(id);

        if (student != null) {
            student.printDetails();
        } else {
            System.out.println("Student not found!");
        }
    }

    private static Student findStudentObject(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}