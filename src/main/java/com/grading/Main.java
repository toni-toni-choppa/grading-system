package com.grading;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Create instances of Student and Teacher
        ArrayList<Student> students = new ArrayList<>();

        // Add some sample students / teachers
        students.add(new Student("johnd", "John Doe"));
        students.add(new Student("mjackson", "Michael Jackson"));
        students.add(new Student("jsmith", "John Smith"));

        // Create a Course
        Teacher teacher = new Teacher("janed", "Mrs. Jane Doe");
        Course course = new Course("Math 101", teacher, students);

        boolean loggedIn = false;

        // Print menu for login
        do {
            System.out.println("Enter Username: ");

            String input = in.nextLine();

            for (Student s : course.getStudents()) {
                if (s.getUsername().equals(input)) {
                    System.out.println("Welcome, " + s.getName() + "!");
                    s.showMenu();
                    loggedIn = true;
                    break;
                }
            }

            if (course.getTeacher().getUsername().equals(input)) {
                System.out.println("Welcome, " + course.getTeacher().getName() + "!");
                course.getTeacher().showMenu(course);
                loggedIn = true;
                break;
            }
        } while (!loggedIn);
    }
}