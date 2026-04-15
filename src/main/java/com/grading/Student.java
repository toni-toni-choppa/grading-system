package com.grading;

import java.util.Scanner;

/**
 * Student class represents a student in the grading system. It contains the student's username and full name, along with getter methods for these attributes.
 */
public class Student {
    private String username;
    private String name;

    /**
     * Constructor for Student class
     * @param username username for new student
     * @param name full name of the student
     */
    public Student(String username, String name) {
        this.username = username;
        this.name = name;
    }

    /**
     * Get the name of the student
     * @return name of the student
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the username of the student
     * @return username of the student
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Display the menu of options available to the student after login
     */
    public void showMenu() {
        Scanner in = new Scanner(System.in);
        System.out.printf("Current Grade: %f (%s)\n\n", 0.0, "F");

        System.out.println("1. View Grades Breakdown");
        System.out.println("2. Logout");

        int option = 0;

        do {
            System.out.print("Enter an Option: ");
            option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Grades Breakdown (not implemented yet)");
                    option = 0;
                    break;
                case 2:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("[ERROR] Invalid Option. Try Again.");
                    option = 0;
                    break;
            }
        } while (option == 0);
    }
}
