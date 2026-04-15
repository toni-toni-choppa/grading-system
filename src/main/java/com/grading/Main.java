package com.grading;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Create instances of Student and Teacher
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();

        // Add some sample students / teachers
        students.add(new Student("johnd", "John Doe"));
        teachers.add(new Teacher("janed", "Mrs. Jane Doe"));


        String username = null;

        // Print menu for login
        do {
            System.out.println("Enter Username: ");

            String input = in.nextLine();

            for (Student s : students) {
                if (s.getUsername().equals(input)) {
                    username = s.getUsername();
                    System.out.println("Welcome, " + s.getName() + "!");
                }
            }

            for (Teacher t : teachers) {
                if (t.getUsername().equals(input)) {
                    username = t.getUsername();
                    System.out.println("Welcome, " + t.getName() + "!");
                    break;
                }
            }

            System.out.println("[ERROR] User not found. Please try again.");
        } while (username == null);
    }
}