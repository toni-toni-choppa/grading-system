package com.grading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Create instances of Student and Teacher
        Student student = new Student("johnd", "John Doe");
        Teacher teacher = new Teacher("janed", "Mrs. Jane Doe");

        String username = null;

        // Print menu for login
        do {
            System.out.println("Enter Username: ");

            String input = in.nextLine();

            // Placeholder for determining if username exists
            switch (input) {
                case "johnd":
                    username = input;
                    break;
                case "janed":
                    username = input;
                    break;
                default:
                    System.out.println("[ERROR] User not found. Please try again.");
            }
        } while (username == null);

        // Print menu for options after login
        switch (username) {
            case "johnd":
                System.out.println("Welcome, " + student.getName() + "!");
                // Placeholder for student options
                break;
            case "janed":
                System.out.println("Welcome, " + teacher.getName() + "!");
                // Placeholder for teacher options
                break;
        }

    }
}